package ma.enova.radio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.radio.bean.core.FreeTrialConfiguration;
import ma.enova.radio.bean.history.FreeTrialConfigurationHistory;
import ma.enova.radio.dao.criteria.core.FreeTrialConfigurationCriteria;
import ma.enova.radio.dao.criteria.history.FreeTrialConfigurationHistoryCriteria;
import ma.enova.radio.service.facade.admin.FreeTrialConfigurationAdminService;
import ma.enova.radio.ws.converter.FreeTrialConfigurationConverter;
import ma.enova.radio.ws.dto.FreeTrialConfigurationDto;
import ma.enova.radio.zynerator.controller.AbstractController;
import ma.enova.radio.zynerator.dto.AuditEntityDto;
import ma.enova.radio.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api("Manages freeTrialConfiguration services")
@RestController
@RequestMapping("/api/admin/freeTrialConfiguration/")
public class FreeTrialConfigurationRestAdmin extends AbstractController<FreeTrialConfiguration, FreeTrialConfigurationDto, FreeTrialConfigurationHistory, FreeTrialConfigurationCriteria, FreeTrialConfigurationHistoryCriteria, FreeTrialConfigurationAdminService, FreeTrialConfigurationConverter> {

    @ApiOperation("Finds a list of all freeTrialConfigurations")
    @GetMapping("")
    public ResponseEntity<List<FreeTrialConfigurationDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Updates the specified  freeTrialConfiguration")
    @PutMapping("")
    public ResponseEntity<FreeTrialConfigurationDto> update(@RequestBody FreeTrialConfigurationDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Finds a freeTrialConfiguration by id")
    @GetMapping("id/{id}")
    public ResponseEntity<FreeTrialConfigurationDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }

    @ApiOperation("Saves the specified  freeTrialConfiguration")
    @PostMapping("")
    public ResponseEntity<FreeTrialConfigurationDto> save(@RequestBody FreeTrialConfigurationDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Delete list of freeTrialConfiguration")
    @PostMapping("multiple")
    public ResponseEntity<List<FreeTrialConfigurationDto>> delete(@RequestBody List<FreeTrialConfigurationDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }

    @ApiOperation("Delete the specified freeTrialConfiguration")
    @DeleteMapping("")
    public ResponseEntity<FreeTrialConfigurationDto> delete(@RequestBody FreeTrialConfigurationDto dto) throws Exception {
        return super.delete(dto);
    }

    @ApiOperation("Delete the specified freeTrialConfiguration")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }

    @ApiOperation("Delete multiple freeTrialConfigurations by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
        return super.deleteByIdIn(ids);
    }

    @ApiOperation("Finds freeTrialConfigurations by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<FreeTrialConfigurationDto>> findByCriteria(@RequestBody FreeTrialConfigurationCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated freeTrialConfigurations by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody FreeTrialConfigurationCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports freeTrialConfigurations by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody FreeTrialConfigurationCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets freeTrialConfiguration data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody FreeTrialConfigurationCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets freeTrialConfiguration history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets freeTrialConfiguration paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody FreeTrialConfigurationHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports freeTrialConfiguration history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody FreeTrialConfigurationHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets freeTrialConfiguration history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody FreeTrialConfigurationHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }

    public FreeTrialConfigurationRestAdmin(FreeTrialConfigurationAdminService service, FreeTrialConfigurationConverter converter) {
        super(service, converter);
    }


}