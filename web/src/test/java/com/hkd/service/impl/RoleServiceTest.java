package com.hkd.service.impl;


import com.hkd.Application;
import com.hkd.service.RoleService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class RoleServiceTest {


    @Autowired
    private RoleService roleService;

    @Test
    public void testFindRoleByIds(){
        Assert.assertNotNull(roleService.findRoleByIds(null));

    }

}
