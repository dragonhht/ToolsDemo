package com.github.dragonhht;

import com.esotericsoftware.reflectasm.ConstructorAccess;
import com.esotericsoftware.reflectasm.FieldAccess;
import com.esotericsoftware.reflectasm.MethodAccess;

/**
 * .
 *
 * @author: huang
 * @Date: 2019-3-24
 */
public class Test {

    @org.junit.Test
    public void testMethod() {
        User user = new User();
        MethodAccess access = MethodAccess.get(User.class);
        // 调用方法
        access.invoke(user, "work", "code");
        access.invoke(user, "study");
        access.invoke(user, "setName", "dragonhht");
        System.out.println(user.getName());
        FieldAccess fieldAccess = FieldAccess.get(User.class);
        // 不能设置私有属性，私有属性使用setter方法设置
        fieldAccess.set(user, "address", "haha");
        System.out.println(fieldAccess.get(user, "address"));

        ConstructorAccess<User> constructorAccess = ConstructorAccess.get(User.class);
        User user1 = constructorAccess.newInstance();
        user1.setId(12);
        System.out.println(user1);
    }

}
