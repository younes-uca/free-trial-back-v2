package ma.enova.radio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.radio.bean.core.Teacher;
import ma.enova.radio.bean.history.TeacherHistory;
import ma.enova.radio.dao.criteria.core.TeacherCriteria;
import ma.enova.radio.dao.criteria.history.TeacherHistoryCriteria;
import ma.enova.radio.service.facade.admin.TeacherAdminService;
import ma.enova.radio.ws.converter.TeacherConverter;
import ma.enova.radio.ws.dto.TeacherDto;
import ma.enova.radio.zynerator.controller.AbstractController;
import ma.enova.radio.zynerator.dto.AuditEntityDto;
import ma.enova.radio.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api("Manages teacher services")
@RestController
@RequestMapping("/api/admin/teacher/")
public class TeacherRestAdmin extends AbstractController<Teacher, TeacherDto, TeacherHistory, TeacherCriteria, TeacherHistoryCriteria, TeacherAdminService, TeacherConverter> {

    @ApiOperation("Finds a list of all teachers")
    @GetMapping("")
    public ResponseEntity<List<TeacherDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Updates the specified  teacher")
    @PutMapping("")
    public ResponseEntity<TeacherDto> update(@RequestBody TeacherDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Finds a teacher by id")
    @GetMapping("id/{id}")
    public ResponseEntity<TeacherDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }

    @ApiOperation("Saves the specified  teacher")
    @PostMapping("")
    public ResponseEntity<TeacherDto> save(@RequestBody TeacherDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Delete list of teacher")
    @PostMapping("multiple")
    public ResponseEntity<List<TeacherDto>> delete(@RequestBody List<TeacherDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }

    @ApiOperation("Delete the specified teacher")
    @DeleteMapping("")
    public ResponseEntity<TeacherDto> delete(@RequestBody TeacherDto dto) throws Exception {
        return super.delete(dto);
    }

    @ApiOperation("Delete the specified teacher")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }

    @ApiOperation("Delete multiple teachers by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
        return super.deleteByIdIn(ids);
    }

    @ApiOperation("Finds teachers by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<TeacherDto>> findByCriteria(@RequestBody TeacherCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated teachers by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody TeacherCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports teachers by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody TeacherCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets teacher data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody TeacherCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets teacher history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets teacher paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody TeacherHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports teacher history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody TeacherHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets teacher history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody TeacherHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }

    public TeacherRestAdmin(TeacherAdminService service, TeacherConverter converter) {
        super(service, converter);
    }


}