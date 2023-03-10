package ma.enova.radio.zynerator.security.dao;

import ma.enova.radio.zynerator.security.bean.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionDao extends JpaRepository<Permission, Long> {
    public Permission findByName(String name);
}
