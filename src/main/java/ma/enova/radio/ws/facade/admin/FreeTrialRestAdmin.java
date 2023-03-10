package ma.enova.radio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.radio.bean.core.FreeTrial;
import ma.enova.radio.bean.history.FreeTrialHistory;
import ma.enova.radio.dao.criteria.core.FreeTrialCriteria;
import ma.enova.radio.dao.criteria.history.FreeTrialHistoryCriteria;
import ma.enova.radio.service.facade.admin.FreeTrialAdminService;
import ma.enova.radio.ws.converter.FreeTrialConverter;
import ma.enova.radio.ws.dto.FreeTrialDto;
import ma.enova.radio.zynerator.controller.AbstractController;
import ma.enova.radio.zynerator.dto.AuditEntityDto;
import ma.enova.radio.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api("Manages freeTrial services")
@RestController
@RequestMapping("/api/admin/freeTrial/")
public class FreeTrialRestAdmin extends AbstractController<FreeTrial, FreeTrialDto, FreeTrialHistory, FreeTrialCriteria, FreeTrialHistoryCriteria, FreeTrialAdminService, FreeTrialConverter> {

    @ApiOperation("Finds a list of all freeTrials")
    @GetMapping("")
    public ResponseEntity<List<FreeTrialDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an appropriate list of freeTrials")
    @GetMapping("appropriateFreeTrials")
    public List<FreeTrialDto> findAppropriateFreeTrial() {
        return converter.toDto(service.findAppropriateFreeTrial());
    }

    @ApiOperation("Updates the specified  freeTrial")
    @PutMapping("")
    public ResponseEntity<FreeTrialDto> update(@RequestBody FreeTrialDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Finds a freeTrial by id")
    @GetMapping("id/{id}")
    public ResponseEntity<FreeTrialDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }

    @ApiOperation("Saves the specified  freeTrial")
    @PostMapping("")
    public ResponseEntity<FreeTrialDto> save(@RequestBody FreeTrialDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Delete list of freeTrial")
    @PostMapping("multiple")
    public ResponseEntity<List<FreeTrialDto>> delete(@RequestBody List<FreeTrialDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }

    @ApiOperation("Delete the specified freeTrial")
    @DeleteMapping("")
    public ResponseEntity<FreeTrialDto> delete(@RequestBody FreeTrialDto dto) throws Exception {
        return super.delete(dto);
    }

    @ApiOperation("Delete the specified freeTrial")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }

    @ApiOperation("Delete multiple freeTrials by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
        return super.deleteByIdIn(ids);
    }

    @ApiOperation("find by teacher id")
    @GetMapping("teacher/id/{id}")
    public List<FreeTrial> findByTeacherId(@PathVariable Long id) {
        return service.findByTeacherId(id);
    }

    @ApiOperation("delete by teacher id")
    @DeleteMapping("teacher/id/{id}")
    public int deleteByTeacherId(@PathVariable Long id) {
        return service.deleteByTeacherId(id);
    }

    @ApiOperation("find by level id")
    @GetMapping("level/id/{id}")
    public List<FreeTrial> findByLevelId(@PathVariable Long id) {
        return service.findByLevelId(id);
    }

    @ApiOperation("delete by level id")
    @DeleteMapping("level/id/{id}")
    public int deleteByLevelId(@PathVariable Long id) {
        return service.deleteByLevelId(id);
    }

    @ApiOperation("find by freeTrialStudentWhatsTemplate id")
    @GetMapping("freeTrialStudentWhatsTemplate/id/{id}")
    public List<FreeTrial> findByFreeTrialStudentWhatsTemplateId(@PathVariable Long id) {
        return service.findByFreeTrialStudentWhatsTemplateId(id);
    }

    @ApiOperation("delete by freeTrialStudentWhatsTemplate id")
    @DeleteMapping("freeTrialStudentWhatsTemplate/id/{id}")
    public int deleteByFreeTrialStudentWhatsTemplateId(@PathVariable Long id) {
        return service.deleteByFreeTrialStudentWhatsTemplateId(id);
    }

    @ApiOperation("find by freeTrialStudentEmailTemplate id")
    @GetMapping("freeTrialStudentEmailTemplate/id/{id}")
    public List<FreeTrial> findByFreeTrialStudentEmailTemplateId(@PathVariable Long id) {
        return service.findByFreeTrialStudentEmailTemplateId(id);
    }

    @ApiOperation("delete by freeTrialStudentEmailTemplate id")
    @DeleteMapping("freeTrialStudentEmailTemplate/id/{id}")
    public int deleteByFreeTrialStudentEmailTemplateId(@PathVariable Long id) {
        return service.deleteByFreeTrialStudentEmailTemplateId(id);
    }

    @ApiOperation("find by freeTrialTeacherEmailTemplate id")
    @GetMapping("freeTrialTeacherEmailTemplate/id/{id}")
    public List<FreeTrial> findByFreeTrialTeacherEmailTemplateId(@PathVariable Long id) {
        return service.findByFreeTrialTeacherEmailTemplateId(id);
    }

    @ApiOperation("delete by freeTrialTeacherEmailTemplate id")
    @DeleteMapping("freeTrialTeacherEmailTemplate/id/{id}")
    public int deleteByFreeTrialTeacherEmailTemplateId(@PathVariable Long id) {
        return service.deleteByFreeTrialTeacherEmailTemplateId(id);
    }

    @ApiOperation("find by freeTrialTeacherWhatsTemplate id")
    @GetMapping("freeTrialTeacherWhatsTemplate/id/{id}")
    public List<FreeTrial> findByFreeTrialTeacherWhatsTemplateId(@PathVariable Long id) {
        return service.findByFreeTrialTeacherWhatsTemplateId(id);
    }

    @ApiOperation("delete by freeTrialTeacherWhatsTemplate id")
    @DeleteMapping("freeTrialTeacherWhatsTemplate/id/{id}")
    public int deleteByFreeTrialTeacherWhatsTemplateId(@PathVariable Long id) {
        return service.deleteByFreeTrialTeacherWhatsTemplateId(id);
    }

    @ApiOperation("find by freeTrialConfiguration id")
    @GetMapping("freeTrialConfiguration/id/{id}")
    public List<FreeTrial> findByFreeTrialConfigurationId(@PathVariable Long id) {
        return service.findByFreeTrialConfigurationId(id);
    }

    @ApiOperation("delete by freeTrialConfiguration id")
    @DeleteMapping("freeTrialConfiguration/id/{id}")
    public int deleteByFreeTrialConfigurationId(@PathVariable Long id) {
        return service.deleteByFreeTrialConfigurationId(id);
    }

    @ApiOperation("find by statutFreeTrial id")
    @GetMapping("statutFreeTrial/id/{id}")
    public List<FreeTrial> findByStatutFreeTrialId(@PathVariable Long id) {
        return service.findByStatutFreeTrialId(id);
    }

    @ApiOperation("delete by statutFreeTrial id")
    @DeleteMapping("statutFreeTrial/id/{id}")
    public int deleteByStatutFreeTrialId(@PathVariable Long id) {
        return service.deleteByStatutFreeTrialId(id);
    }

    @ApiOperation("Finds a freeTrial and associated list by id")
    @GetMapping("detail/id/{id}")
    public ResponseEntity<FreeTrialDto> findWithAssociatedLists(@PathVariable Long id) {
        return super.findWithAssociatedLists(id);
    }

    @ApiOperation("Finds freeTrials by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<FreeTrialDto>> findByCriteria(@RequestBody FreeTrialCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated freeTrials by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody FreeTrialCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports freeTrials by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody FreeTrialCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets freeTrial data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody FreeTrialCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets freeTrial history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets freeTrial paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody FreeTrialHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports freeTrial history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody FreeTrialHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets freeTrial history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody FreeTrialHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }

    public FreeTrialRestAdmin(FreeTrialAdminService service, FreeTrialConverter converter) {
        super(service, converter);
    }


}