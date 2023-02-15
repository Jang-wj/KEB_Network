import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

enum Gender {
    남, 여
}

class Member{
    String name;
    Gender gender;
    int age;


    public Member(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return String.format("Member(%s, %s, %d)", name, gender, age);
    }

}

public class Day23_StreamProblems {

    static int i = 0;
    public static void main(String[] args) {
        Stream<String> st;
        List<String> names = List.of("홍길동", "배장화", "임꺽정", "연흥부", "김선달", "황진이");
        st = names.stream();
        st.filter(n -> n.charAt(0) < '이').forEach(n -> System.out.print(n + " "));

        System.out.println();
        names.stream().sorted().forEach(n -> System.out.print(n + " "));

        System.out.println();
        st = names.stream();
        System.out.println(st.findFirst());
        st = names.stream();
        System.out.println(st.findFirst().get());

        st = names.stream();
        System.out.println(st.count());


        List<Integer> ages = List.of(25, 20, 29, 28, 32, 18);
        List<Gender> genders = List.of(Gender.남, Gender.여, Gender.남, Gender.남, Gender.남, Gender.여);
        Stream<Integer> si = ages.stream();
        System.out.println(si.reduce(Integer::sum).get());
        si = ages.stream();
        System.out.println(si.max(Integer::compareTo).get());
        IntStream is = ages.stream().mapToInt(Integer::intValue);
        System.out.println(is.average().getAsDouble());


        st = names.stream();
        Stream<Member> sm = st.map(n -> new Member(n, genders.get(i), ages.get(i++)));
        System.out.println("\n[Member 스트림 원소]");
        sm.forEach(m -> System.out.print(m + " "));
        System.out.println();

        i = 0;
        st = names.stream();
        sm = st.map(n -> new Member(n, genders.get(i), ages.get(i++)));
        Map<Gender, List<Member>> map = sm.collect(Collectors.groupingBy(Member::getGender));
        System.out.println("\n[Member 스트림을 성별로 그룹핑]");
        System.out.println(map);
    }
}
