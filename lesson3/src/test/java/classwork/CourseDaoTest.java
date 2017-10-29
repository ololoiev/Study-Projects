package classwork;

import classwork.dao.CourseDao;
import classwork.dao.DefaultCourseDao;
import classwork.entity.Course;
import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Random;

public class CourseDaoTest {
    private static final int TEST_ID = 999;
    private static final String UPDATE_TEST_NAME = "UpdateTestName";
    private static final String UPDATE_TEST_SURNAME = "UpdateTestSurname";
    private final int TEST_HOURS = 15;
    private final String TEST_NAME = "TestName";
    private final String TEST_SURNAME = "TestSurname";
    private final String TEST_PATRONYMIC = "TestPatronymic";
    private final String TEST_TITLE = "TestTitle";

    private static CourseDao courseDao;
    private static Random random;

    private Course course = new Course();

    @BeforeClass
    public static void init() {
        courseDao = DefaultCourseDao.getInstance();
        random = new Random();
    }

    @Before
    public void createTestCourse() {
        course.setId(TEST_ID);
        course.setTitle(TEST_TITLE);
        course.setHours(TEST_HOURS);
        course.setFirstName(TEST_NAME);
        course.setLastName(TEST_SURNAME);
        course.setPatronymic(TEST_PATRONYMIC);
        courseDao.saveCourse(course);
    }

    @After
    public void removeTestCourse() {
        courseDao.delete(TEST_ID);
    }

    @Test
    public void saveCourse() throws Exception {
        course.setId(TEST_ID + 1);
        course.setTitle(TEST_TITLE);
        course.setHours(TEST_HOURS);
        course.setFirstName(TEST_NAME);
        course.setLastName(TEST_SURNAME);
        course.setPatronymic(TEST_PATRONYMIC);
        courseDao.saveCourse(course);

        Course course = courseDao.getCourseById(TEST_ID + 1);
        assertEquals(TEST_ID + 1, course.getId());
        assertEquals(TEST_NAME, course.getFirstName());
        assertEquals(TEST_SURNAME, course.getLastName());
        assertEquals(TEST_HOURS, course.getHours());
        assertEquals(TEST_PATRONYMIC, course.getPatronymic());
        assertEquals(TEST_TITLE, course.getTitle());

        courseDao.delete(TEST_ID + 1);
    }

    @Test
    public void getCourses() throws Exception {
        List<Course> courses = courseDao.getCourses();
        assertNotNull(courses);
        assertEquals(courses.size(), 6);
    }

    @Test
    public void getCourse() throws Exception {
        Course course = courseDao.getCourseById(TEST_ID);
        assertNotNull(course);
    }

    @Test
    public void update() throws Exception {
        Course course = courseDao.getCourseById(TEST_ID);
        course.setFirstName(UPDATE_TEST_NAME);
        course.setLastName(UPDATE_TEST_SURNAME);
        course.setHours(TEST_HOURS);
        course.setTitle(TEST_TITLE);
        courseDao.update(course);
        Course courseUpdate = courseDao.getCourseById(TEST_ID);
        assertEquals(UPDATE_TEST_NAME, courseUpdate.getFirstName());
        assertEquals(UPDATE_TEST_SURNAME, courseUpdate.getLastName());
    }
}
