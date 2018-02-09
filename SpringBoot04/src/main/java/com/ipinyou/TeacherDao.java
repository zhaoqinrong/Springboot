package com.ipinyou;

import org.springframework.data.jpa.repository.support.CrudMethodMetadata;
import org.springframework.data.repository.CrudRepository;

/**
 * Teacher是实体类的类型
 * Integer是主键的类型
 * CrudRepository中有增删改查的方法
 */
public interface TeacherDao extends CrudRepository<Teacher,Integer>{
}
