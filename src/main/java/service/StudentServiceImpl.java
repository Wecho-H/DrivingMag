package service;

import dao.StudentDao;
import domain.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("studentService")
@Transactional
public class StudentServiceImpl implements StudentService {
    @Resource(name="studentDao")
    private StudentDao studentDao;

    @Override
    public Student findStudent(String stu_id) {
        return studentDao.findById(stu_id);
    }

    @Override
    public void save(Student student) {
        studentDao.save(student);
    }

    @Override
    public void update(Student student) {
        studentDao.update(student);
    }

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }
}
