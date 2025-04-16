package Pr9;
import java.util.*;

interface GradeService {
    void addGrade(String studentName, int grade);
    List<Integer> getGrades(String studentName);
    void printAllGrades();
}

abstract class AbstractGradeService implements GradeService {
    protected Map<String, List<Integer>> gradesMap = new HashMap<>();

    @Override
    public void addGrade(String studentName, int grade) {
        gradesMap.computeIfAbsent(studentName, k -> new ArrayList<>()).add(grade);
    }

    @Override
    public List<Integer> getGrades(String studentName) {
        return gradesMap.getOrDefault(studentName, new ArrayList<>());
    }

    @Override
    public void printAllGrades() {
        for (Map.Entry<String, List<Integer>> entry : gradesMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

class SubjectGradeService extends AbstractGradeService {
    private String subjectName;

    public SubjectGradeService(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }
}
