#include "Student.cpp"
#include "Person.cpp"
#include "Teacher.cpp"
#include<iostream>

using namespace std;

int main() {
	Student s("Khanh", 23, "Ha Noi", 9.0);
	s.display();
	Teacher t("Tung", 34, "Ha Noi", 1700);
	t.display();
	return 0;
}