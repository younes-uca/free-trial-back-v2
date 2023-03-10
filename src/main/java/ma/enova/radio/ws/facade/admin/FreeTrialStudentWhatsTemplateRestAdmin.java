package ma.enova.radio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.radio.bean.core.FreeTrialStudentWhatsTemplate;
import ma.enova.radio.bean.history.FreeTrialStudentWhatsTemplateHistory;
import ma.enova.radio.dao.criteria.core.FreeTrialStudentWhatsTemplateCriteria;
import ma.enova.radio.dao.criteria.history.FreeTrialStudentWhatsTemplateHistoryCriteria;
import ma.enova.radio.service.facade.admin.FreeTrialStudentWhatsTemplateAdminService;
import ma.enova.radio.ws.converter.FreeTrialStudentWhatsTemplateConverter;
import ma.enova.radio.ws.dto.FreeTrialStudentWhatsTemplateDto;
import ma.enova.radio.zynerator.controller.AbstractController;
import ma.enova.radio.zynerator.dto.AuditEntityDto;
import ma.enova.radio.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api("Manages freeTrialStudentWhatsTemplate services")
@RestController
@RequestMapping("/api/admin/freeTrialStudentWhatsTemplate/")
public class FreeTrialStudentWhatsTemplateRestAdmin extends AbstractController<FreeTrialStudentWhatsTemplate, FreeTrialStudentWhatsTemplateDto, FreeTrialStudentWhatsTemplateHistory, FreeTrialStudentWhatsTemplateCriteria, FreeTrialStudentWhatsTemplateHistoryCriteria, FreeTrialStudentWhatsTemplateAdminService, FreeTrialStudentWhatsTemplateConverter> {

    @ApiOperation("Finds a list of all freeTrialStudentWhatsTemplates")
    @GetMapping("")
    public ResponseEntity<List<FreeTrialStudentWhatsTemplateDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Updates the specified  freeTrialStudentWhatsTemplate")
    @PutMapping("")
    public ResponseEntity<FreeTrialStudentWhatsTemplateDto> update(@RequestBody FreeTrialStudentWhatsTemplateDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Finds a freeTrialStudentWhatsTemplate by id")
    @GetMapping("id/{id}")
    public ResponseEntity<FreeTrialStudentWhatsTemplateDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }

    @ApiOperation("Saves the specified  freeTrialStudentWhatsTemplate")
    @PostMapping("")
    public ResponseEntity<FreeTrialStudentWhatsTemplateDto> save(@RequestBody FreeTrialStudentWhatsTemplateDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Delete list of freeTrialStudentWhatsTemplate")
    @PostMapping("multiple")
    public ResponseEntity<List<FreeTrialStudentWhatsTemplateDto>> delete(@RequestBody List<FreeTrialStudentWhatsTemplateDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }

    @ApiOperation("Delete the specified freeTrialStudentWhatsTemplate")
    @DeleteMapping("")
    public ResponseEntity<FreeTrialStudentWhatsTemplateDto> delete(@RequestBody FreeTrialStudentWhatsTemplateDto dto) throws Exception {
        return super.delete(dto);
    }

    @ApiOperation("Delete the specified freeTrialStudentWhatsTemplate")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }

    @ApiOperation("Delete multiple freeTrialStudentWhatsTemplates by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
        return super.deleteByIdIn(ids);
    }

    @ApiOperation("Finds freeTrialStudentWhatsTemplates by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<FreeTrialStudentWhatsTemplateDto>> findByCriteria(@RequestBody FreeTrialStudentWhatsTemplateCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated freeTrialStudentWhatsTemplates by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody FreeTrialStudentWhatsTemplateCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports freeTrialStudentWhatsTemplates by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody FreeTrialStudentWhatsTemplateCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets freeTrialStudentWhatsTemplate data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody FreeTrialStudentWhatsTemplateCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets freeTrialStudentWhatsTemplate history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets freeTrialStudentWhatsTemplate paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody FreeTrialStudentWhatsTemplateHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports freeTrialStudentWhatsTemplate history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody FreeTrialStudentWhatsTemplateHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets freeTrialStudentWhatsTemplate history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody FreeTrialStudentWhatsTemplateHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }

    public FreeTrialStudentWhatsTemplateRestAdmin(FreeTrialStudentWhatsTemplateAdminService service, FreeTrialStudentWhatsTemplateConverter converter) {
        super(service, converter);
    }


}