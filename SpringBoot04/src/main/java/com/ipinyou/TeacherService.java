package com.ipinyou;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class TeacherService {
    @Resource
    private TeacherDao teacherDao;

    /**
     * 增加
     * @param teacher
     */
    public void add(Teacher teacher){
        teacherDao.save(teacher);
    }

    /**
     * 删除
     * @param id
     */
    public void delete(Integer id){
    teacherDao.delete(id);
    }

    /**
     * 修改
     * @param teacher
     */
    public void update(Teacher teacher){
    teacherDao.save(teacher);
    }
    public void find(Integer id){
        Teacher one = teacherDao.findOne(id);
        System.out.println(one);
    }

}
