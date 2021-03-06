package seedu.resireg.testutil;

import static seedu.resireg.logic.commands.CommandTestUtil.VALID_EMAIL_AMY;
import static seedu.resireg.logic.commands.CommandTestUtil.VALID_EMAIL_BOB;
import static seedu.resireg.logic.commands.CommandTestUtil.VALID_FACULTY_AMY;
import static seedu.resireg.logic.commands.CommandTestUtil.VALID_FACULTY_BOB;
import static seedu.resireg.logic.commands.CommandTestUtil.VALID_NAME_AMY;
import static seedu.resireg.logic.commands.CommandTestUtil.VALID_NAME_BOB;
import static seedu.resireg.logic.commands.CommandTestUtil.VALID_PHONE_AMY;
import static seedu.resireg.logic.commands.CommandTestUtil.VALID_PHONE_BOB;
import static seedu.resireg.logic.commands.CommandTestUtil.VALID_STUDENT_ID_AMY;
import static seedu.resireg.logic.commands.CommandTestUtil.VALID_STUDENT_ID_BOB;
import static seedu.resireg.logic.commands.CommandTestUtil.VALID_TAG_FRIEND;
import static seedu.resireg.logic.commands.CommandTestUtil.VALID_TAG_HUSBAND;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.resireg.model.AddressBook;
import seedu.resireg.model.student.Student;

/**
 * A utility class containing a list of {@code Student} objects to be used in tests.
 */
public class TypicalStudents {

    public static final Student ALICE = new StudentBuilder().withName("Alice Pauline")
            .withFaculty("FASS")
            .withStudentId("E0111110")
            .withEmail("alice@example.com")
            .withPhone("94351253")
            .withTags("friends").build();
    public static final Student BENSON = new StudentBuilder().withName("Benson Meier")
            .withFaculty("FASS")
            .withStudentId("E0222228")
            .withEmail("benson@example.com")
            .withPhone("98765432")
            .withTags("owesMoney", "friends")
            .withRoom(new RoomBuilder().withFloor("1").withRoomNumber("101").build()).build();
    public static final Student CARL = new StudentBuilder().withName("Carl Kurz")
            .withPhone("95352563")
            .withEmail("carl@example.com")
            .withFaculty("FASS")
            .withStudentId("E0111112").build();
    public static final Student DANIEL = new StudentBuilder().withName("Daniel Meier")
            .withPhone("87652533")
            .withFaculty("FASS")
            .withStudentId("E0111113")
            .withEmail("daniel@example.com")
            .withTags("friends").build();
    public static final Student ELLE = new StudentBuilder().withName("Elle Meyer")
            .withPhone("9482224")
            .withEmail("elle@example.com")
            .withFaculty("FASS")
            .withStudentId("E0111114").build();
    public static final Student FIONA = new StudentBuilder().withName("Fiona Kunz")
            .withPhone("9482427")
            .withEmail("fiona@example.com")
            .withFaculty("FASS")
            .withStudentId("E0111115").build();
    public static final Student GEORGE = new StudentBuilder().withName("George Best")
            .withPhone("9482442")
            .withEmail("george@example.com")
            .withFaculty("FASS")
            .withStudentId("E0111101").build();

    // Manually added
    public static final Student HOON = new StudentBuilder().withName("Hoon Meier").withPhone("8482424")
            .withEmail("stefan@example.com").withFaculty("FASS").withStudentId("E0111116").build();
    public static final Student IDA = new StudentBuilder().withName("Ida Mueller").withPhone("8482131")
            .withEmail("hans@example.com").withFaculty("FASS").withStudentId("E0111117").build();

    // Manually added - Student's details found in {@code CommandTestUtil}
    public static final Student AMY = new StudentBuilder().withName(VALID_NAME_AMY).withPhone(VALID_PHONE_AMY)
            .withEmail(VALID_EMAIL_AMY).withFaculty(VALID_FACULTY_AMY).withStudentId(VALID_STUDENT_ID_AMY)
            .withTags(VALID_TAG_FRIEND).build();
    public static final Student BOB = new StudentBuilder().withName(VALID_NAME_BOB).withPhone(VALID_PHONE_BOB)
            .withEmail(VALID_EMAIL_BOB).withFaculty(VALID_FACULTY_BOB).withStudentId(VALID_STUDENT_ID_BOB)
            .withTags(VALID_TAG_HUSBAND, VALID_TAG_FRIEND).build();

    public static final String KEYWORD_MATCHING_MEIER = "Meier"; // A keyword that matches MEIER

    private TypicalStudents() {} // prevents instantiation

    /**
     * Returns an {@code AddressBook} with all the typical students.
     */
    public static AddressBook getTypicalAddressBook() {
        AddressBook ab = new AddressBook();
        for (Student student : getTypicalStudents()) {
            ab.addStudent(student);
        }
        return ab;
    }

    public static List<Student> getTypicalStudents() {
        return new ArrayList<>(Arrays.asList(ALICE, BENSON, CARL, DANIEL, ELLE, FIONA, GEORGE));
    }
}
