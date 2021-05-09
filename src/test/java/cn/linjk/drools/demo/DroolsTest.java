package cn.linjk.drools.demo;

import cn.linjk.drools.demo.entity.CompareEntity;
import cn.linjk.drools.demo.entity.Order;
import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * Copyright 1990-2020 LinJK
 *
 * @fileName: DroolsTest
 * @author: linjk
 * @date: 2021/5/6 下午10:14
 * @description:
 */
public class DroolsTest {
    @Test
    public void testOne() {
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieContainer = kieServices.newKieClasspathContainer();
        KieSession kieSession = kieContainer.newKieSession();
        // Fact对象
        Order order = new Order();
        order.setOriginalPrice(121.1);
        kieSession.insert(order);
        // 激活规则，由drools框架自动进行规则匹配
        kieSession.fireAllRules();
        kieSession.dispose();
    }

    @Test
    public void testTwo() {
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieContainer = kieServices.newKieClasspathContainer();
        KieSession kieSession = kieContainer.newKieSession();
        // Fact对象
        CompareEntity order = new CompareEntity();
        order.setNames("lin11");
        kieSession.insert(order);
        // 激活规则，由drools框架自动进行规则匹配
        kieSession.fireAllRules();
        kieSession.dispose();
    }
}
