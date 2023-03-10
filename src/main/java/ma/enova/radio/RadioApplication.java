package ma.enova.radio;

import ma.enova.radio.bean.core.*;
import ma.enova.radio.service.facade.admin.*;
import ma.enova.radio.zynerator.security.bean.Permission;
import ma.enova.radio.zynerator.security.bean.Role;
import ma.enova.radio.zynerator.security.bean.User;
import ma.enova.radio.zynerator.security.common.AuthoritiesConstants;
import ma.enova.radio.zynerator.security.service.facade.RoleService;
import ma.enova.radio.zynerator.security.service.facade.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
//@EnableFeignClients("ma.enova.radio.required.facade")
@EnableScheduling
public class RadioApplication {
    public static ConfigurableApplicationContext ctx;

    public static void main(String[] args) {
        ctx = SpringApplication.run(RadioApplication.class, args);
    }


    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static ConfigurableApplicationContext getCtx() {
        return ctx;
    }

    @Bean
    public CommandLineRunner demo(UserService userService, RoleService roleService) {
        return (args) -> {
            if (false) {

                createFreeTrialConfiguration();
                createFreeTrialTeacherWhatsTemplate();
                createTeacher();
                createStudent();
                createFreeTrialStudentWhatsTemplate();
                createFreeTrialTeacherEmailTemplate();
                createFreeTrialStudentEmailTemplate();


                // Role admin

                User userForAdmin = new User("admin");

                Role roleForAdmin = new Role();
                roleForAdmin.setAuthority(AuthoritiesConstants.ADMIN);
                List<Permission> permissionsForAdmin = new ArrayList<>();
                addPermissionForAdmin(permissionsForAdmin);
                roleForAdmin.setPermissions(permissionsForAdmin);
                if (userForAdmin.getRoles() == null)
                    userForAdmin.setRoles(new ArrayList<>());

                userForAdmin.getRoles().add(roleForAdmin);
                userService.save(userForAdmin);
            }
        };
    }


    private void createFreeTrialConfiguration() {
        String dateApplicationDebut = "dateApplicationDebut";
        String dateApplicationFin = "dateApplicationFin";
        String nombreStudentMax = "nombreStudentMax";
        String nombreStudentMin = "nombreStudentMin";
        for (int i = 1; i < 100; i++) {
            FreeTrialConfiguration item = new FreeTrialConfiguration();
            item.setDateApplicationDebut(fakeLocalDateTime(dateApplicationDebut, i));
            item.setDateApplicationFin(fakeLocalDateTime(dateApplicationFin, i));
            item.setNombreStudentMax(fakeInteger(nombreStudentMax, i));
            item.setNombreStudentMin(fakeInteger(nombreStudentMin, i));
            freeTrialConfigurationService.create(item);
        }
    }

    private void createFreeTrialTeacherWhatsTemplate() {
        String object = "object";
        String corps = "corps";
        String source = "source";
        for (int i = 1; i < 100; i++) {
            FreeTrialTeacherWhatsTemplate item = new FreeTrialTeacherWhatsTemplate();
            item.setObject(fakeString(object, i));
            item.setCorps(fakeString(corps, i));
            item.setSource(fakeString(source, i));
            freeTrialTeacherWhatsTemplateService.create(item);
        }
    }

    private void createTeacher() {
        String libelle = "libelle";
        String code = "code";
        String email = "email";
        String phone = "phone";
        for (int i = 1; i < 100; i++) {
            Teacher item = new Teacher();
            item.setLibelle(fakeString(libelle, i));
            item.setCode(fakeString(code, i));
            item.setEmail(fakeString(email, i));
            item.setPhone(fakeString(phone, i));
            teacherService.create(item);
        }
    }

    private void createStudent() {
        String libelle = "libelle";
        String code = "code";
        String email = "email";
        String phone = "phone";
        for (int i = 1; i < 100; i++) {
            Student item = new Student();
            item.setLibelle(fakeString(libelle, i));
            item.setCode(fakeString(code, i));
            item.setEmail(fakeString(email, i));
            item.setPhone(fakeString(phone, i));
            studentService.create(item);
        }
    }

    private void createFreeTrialStudentWhatsTemplate() {
        String object = "object";
        String corps = "corps";
        String source = "source";
        for (int i = 1; i < 100; i++) {
            FreeTrialStudentWhatsTemplate item = new FreeTrialStudentWhatsTemplate();
            item.setObject(fakeString(object, i));
            item.setCorps(fakeString(corps, i));
            item.setSource(fakeString(source, i));
            freeTrialStudentWhatsTemplateService.create(item);
        }
    }

    private void createFreeTrialTeacherEmailTemplate() {
        String object = "object";
        String corps = "corps";
        String source = "source";
        for (int i = 1; i < 100; i++) {
            FreeTrialTeacherEmailTemplate item = new FreeTrialTeacherEmailTemplate();
            item.setObject(fakeString(object, i));
            item.setCorps(fakeString(corps, i));
            item.setSource(fakeString(source, i));
            freeTrialTeacherEmailTemplateService.create(item);
        }
    }

    private void createFreeTrialStudentEmailTemplate() {
        String object = "object";
        String corps = "corps";
        String source = "source";
        for (int i = 1; i < 100; i++) {
            FreeTrialStudentEmailTemplate item = new FreeTrialStudentEmailTemplate();
            item.setObject(fakeString(object, i));
            item.setCorps(fakeString(corps, i));
            item.setSource(fakeString(source, i));
            freeTrialStudentEmailTemplateService.create(item);
        }
    }

    private static String fakeString(String attributeName, int i) {
        return attributeName + i;
    }

    private static Long fakeLong(String attributeName, int i) {
        return 10L * i;
    }

    private static Integer fakeInteger(String attributeName, int i) {
        return 10 * i;
    }

    private static Double fakeDouble(String attributeName, int i) {
        return 10D * i;
    }

    private static BigDecimal fakeBigDecimal(String attributeName, int i) {
        return BigDecimal.valueOf(i * 1L * 10);
    }

    private static Boolean fakeBoolean(String attributeName, int i) {
        return i % 2 == 0 ? true : false;
    }

    private static LocalDateTime fakeLocalDateTime(String attributeName, int i) {
        return LocalDateTime.now().plusDays(i);
    }

    private static void addPermissionForAdmin(List<Permission> permissions) {
        permissions.add(new Permission("FreeTrial.edit"));
        permissions.add(new Permission("FreeTrial.list"));
        permissions.add(new Permission("FreeTrial.view"));
        permissions.add(new Permission("FreeTrial.add"));
        permissions.add(new Permission("FreeTrial.delete"));
        permissions.add(new Permission("StatutFreeTrial.edit"));
        permissions.add(new Permission("StatutFreeTrial.list"));
        permissions.add(new Permission("StatutFreeTrial.view"));
        permissions.add(new Permission("StatutFreeTrial.add"));
        permissions.add(new Permission("StatutFreeTrial.delete"));
        permissions.add(new Permission("FreeTrialConfiguration.edit"));
        permissions.add(new Permission("FreeTrialConfiguration.list"));
        permissions.add(new Permission("FreeTrialConfiguration.view"));
        permissions.add(new Permission("FreeTrialConfiguration.add"));
        permissions.add(new Permission("FreeTrialConfiguration.delete"));
        permissions.add(new Permission("FreeTrialDetail.edit"));
        permissions.add(new Permission("FreeTrialDetail.list"));
        permissions.add(new Permission("FreeTrialDetail.view"));
        permissions.add(new Permission("FreeTrialDetail.add"));
        permissions.add(new Permission("FreeTrialDetail.delete"));
        permissions.add(new Permission("FreeTrialTeacherWhatsTemplate.edit"));
        permissions.add(new Permission("FreeTrialTeacherWhatsTemplate.list"));
        permissions.add(new Permission("FreeTrialTeacherWhatsTemplate.view"));
        permissions.add(new Permission("FreeTrialTeacherWhatsTemplate.add"));
        permissions.add(new Permission("FreeTrialTeacherWhatsTemplate.delete"));
        permissions.add(new Permission("Level.edit"));
        permissions.add(new Permission("Level.list"));
        permissions.add(new Permission("Level.view"));
        permissions.add(new Permission("Level.add"));
        permissions.add(new Permission("Level.delete"));
        permissions.add(new Permission("Teacher.edit"));
        permissions.add(new Permission("Teacher.list"));
        permissions.add(new Permission("Teacher.view"));
        permissions.add(new Permission("Teacher.add"));
        permissions.add(new Permission("Teacher.delete"));
        permissions.add(new Permission("Student.edit"));
        permissions.add(new Permission("Student.list"));
        permissions.add(new Permission("Student.view"));
        permissions.add(new Permission("Student.add"));
        permissions.add(new Permission("Student.delete"));
        permissions.add(new Permission("Services.edit"));
        permissions.add(new Permission("Services.list"));
        permissions.add(new Permission("Services.view"));
        permissions.add(new Permission("Services.add"));
        permissions.add(new Permission("Services.delete"));
        permissions.add(new Permission("FreeTrialStudentWhatsTemplate.edit"));
        permissions.add(new Permission("FreeTrialStudentWhatsTemplate.list"));
        permissions.add(new Permission("FreeTrialStudentWhatsTemplate.view"));
        permissions.add(new Permission("FreeTrialStudentWhatsTemplate.add"));
        permissions.add(new Permission("FreeTrialStudentWhatsTemplate.delete"));
        permissions.add(new Permission("FreeTrialTeacherEmailTemplate.edit"));
        permissions.add(new Permission("FreeTrialTeacherEmailTemplate.list"));
        permissions.add(new Permission("FreeTrialTeacherEmailTemplate.view"));
        permissions.add(new Permission("FreeTrialTeacherEmailTemplate.add"));
        permissions.add(new Permission("FreeTrialTeacherEmailTemplate.delete"));
        permissions.add(new Permission("FreeTrialStudentEmailTemplate.edit"));
        permissions.add(new Permission("FreeTrialStudentEmailTemplate.list"));
        permissions.add(new Permission("FreeTrialStudentEmailTemplate.view"));
        permissions.add(new Permission("FreeTrialStudentEmailTemplate.add"));
        permissions.add(new Permission("FreeTrialStudentEmailTemplate.delete"));
    }

    @Autowired
    FreeTrialConfigurationAdminService freeTrialConfigurationService;
    @Autowired
    FreeTrialTeacherWhatsTemplateAdminService freeTrialTeacherWhatsTemplateService;
    @Autowired
    TeacherAdminService teacherService;
    @Autowired
    StudentAdminService studentService;
    @Autowired
    FreeTrialStudentWhatsTemplateAdminService freeTrialStudentWhatsTemplateService;
    @Autowired
    FreeTrialTeacherEmailTemplateAdminService freeTrialTeacherEmailTemplateService;
    @Autowired
    FreeTrialStudentEmailTemplateAdminService freeTrialStudentEmailTemplateService;
}


