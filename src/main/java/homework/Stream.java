package homework;

import seminar.my_code.StudyGroup;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Stream implements Iterable<StudyGroup> {
    private List<StudyGroup> studyGroups;

    public Stream() {
        this.studyGroups = new ArrayList<>();
    }

    public void addStudyGroup(StudyGroup group) {
        studyGroups.add(group);
    }

    public List<StudyGroup> getStudyGroups() {
        return studyGroups;
    }

    @Override
    public Iterator<StudyGroup> iterator() {
        return new Iterator<StudyGroup>() {
            private int position = 0;

            @Override
            public boolean hasNext() {
                return position < studyGroups.size();
            }

            @Override
            public StudyGroup next() {
                if (!hasNext()) {
                    throw new NoSuchElementException("Больше нет учебных групп.");
                }
                return studyGroups.get(position++);
            }
        };
    }
}
