package homework;

import seminar.my_code.StudyGroup;
import seminar.my_code.StudyGroupService;

import java.util.List;

public class Controller {
    private final StudyGroupService studyGroupService;
    private final StreamService streamService;

    public Controller(StudyGroupService studyGroupService, StreamService streamService) {
        this.studyGroupService = studyGroupService;
        this.streamService = streamService;
    }

    public void removeStudent(StudyGroup group, String firstName, String lastName) {
        studyGroupService.removeStudentByFullName(group, firstName, lastName);
    }

    public void sortStudents(StudyGroup group) {
        studyGroupService.sortStudentsById(group);
    }

    public void sortStudentsByFullName(StudyGroup group) {
        studyGroupService.sortStudentsByFullName(group);
    }

    public void sortStreams(List<Stream> streams) {
        streamService.sortStreams(streams);
    }
}

