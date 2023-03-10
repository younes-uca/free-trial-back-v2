package ma.enova.radio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.radio.bean.core.Level;
import ma.enova.radio.bean.history.LevelHistory;
import ma.enova.radio.dao.criteria.core.LevelCriteria;
import ma.enova.radio.dao.criteria.history.LevelHistoryCriteria;
import ma.enova.radio.service.facade.admin.LevelAdminService;
import ma.enova.radio.ws.converter.LevelConverter;
import ma.enova.radio.ws.dto.LevelDto;
import ma.enova.radio.zynerator.controller.AbstractController;
import ma.enova.radio.zynerator.dto.AuditEntityDto;
import ma.enova.radio.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api("Manages level services")
@RestController
@RequestMapping("/api/admin/level/")
public class LevelRestAdmin extends AbstractController<Level, LevelDto, LevelHistory, LevelCriteria, LevelHistoryCriteria, LevelAdminService, LevelConverter> {

    @ApiOperation("Finds a list of all levels")
    @GetMapping("")
    public ResponseEntity<List<LevelDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Updates the specified  level")
    @PutMapping("")
    public ResponseEntity<LevelDto> update(@RequestBody LevelDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Finds a level by id")
    @GetMapping("id/{id}")
    public ResponseEntity<LevelDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }

    @ApiOperation("Saves the specified  level")
    @PostMapping("")
    public ResponseEntity<LevelDto> save(@RequestBody LevelDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Delete list of level")
    @PostMapping("multiple")
    public ResponseEntity<List<LevelDto>> delete(@RequestBody List<LevelDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }

    @ApiOperation("Delete the specified level")
    @DeleteMapping("")
    public ResponseEntity<LevelDto> delete(@RequestBody LevelDto dto) throws Exception {
        return super.delete(dto);
    }

    @ApiOperation("Delete the specified level")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }

    @ApiOperation("Delete multiple levels by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
        return super.deleteByIdIn(ids);
    }

    @ApiOperation("Finds levels by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<LevelDto>> findByCriteria(@RequestBody LevelCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated levels by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody LevelCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports levels by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody LevelCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets level data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody LevelCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets level history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets level paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody LevelHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports level history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody LevelHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets level history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody LevelHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }

    public LevelRestAdmin(LevelAdminService service, LevelConverter converter) {
        super(service, converter);
    }


}