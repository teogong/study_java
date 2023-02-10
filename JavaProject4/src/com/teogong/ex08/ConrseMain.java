package com.teogong.ex08;

import java.util.Arrays;

public class ConrseMain {
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseStudent(Course<? extends Student> course) {// Student에 ?이 것은 상속 받은것
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseWorker(Course<? super Worker> course) {// Worker에 ?이 것은 부모
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("일반인과정", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new GraduateStudent("대학원생"));
		
		Course<Worker> workerCourse = new Course<Worker>("직장인과정", 5);
		workerCourse.add(new Worker("직장인"));
		
		Course<Student> studentCourse = new Course<Student>("학생과정", 5);
		studentCourse.add(new Student("학생"));
		studentCourse.add(new GraduateStudent("대학원생"));
		
		Course<GraduateStudent> graduateStudentCourse = new Course<GraduateStudent>("대학원과정", 5);
		graduateStudentCourse.add(new GraduateStudent("대학원생"));
		
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(graduateStudentCourse);
		System.out.println();
		
		registerCourseStudent(studentCourse);
		registerCourseStudent(graduateStudentCourse);
//		registerCourseStudent(personCourse);
//		registerCourseStudent(workerCourse);
		System.out.println();
		
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
//		registerCourseWorker(studentCourse);
//		registerCourseWorker(graduateStudentCourse);
		
		
		
	}
}
