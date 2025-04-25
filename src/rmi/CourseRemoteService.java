package rmi;

import models.Course;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Map;

public interface CourseRemoteService extends Remote {
    void create(Course course) throws RemoteException;
    Course getById(int id) throws RemoteException;
    List<Course> getAll() throws RemoteException;
    void update(Course course) throws RemoteException;
    void delete(int id) throws RemoteException;
    List<Course> getCoursesByProfessorId(int professorId) throws RemoteException;
    List<Course> getCoursesByStudentId(int studentId) throws RemoteException;
    Course getCourseByTestId(int testId) throws RemoteException;
    int getCourseCountByProfessorId(int professorId) throws RemoteException;
    Map<String, Integer> getPassRateDistributionByCourse(int professorId) throws RemoteException;
}
