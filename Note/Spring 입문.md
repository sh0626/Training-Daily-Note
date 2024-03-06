### Spring 들어가기 전

- BOM (Browser Object Model)
  
  - 웹브라우저에서 사용할 수 있는 모든 객체

- DOM (Document Object Model)
  
  - HTML이나 XML과 같은 마크업언어로 작성된 문서에 접근해 **동적으로 문서를 조작하기 위한 표준적인 프로그래밍 인터페이스**
  
  - HTML 문서의 구조를 객체화함

---------------------

Servlet 버전

- Dynamic Web module version -> New Dynamic Project 만들시 지정가능 (이클립스 기준)



- Object Class
  
  - 자바의 모든 클래스의 부모 (조상격)
  
  - 클래스 생성시 상속 (직/간접적으로)
  
  - Java.lang
    
    - 자바에서 가장 많이 사용하는 패키지를 모아놓음
    
    - import하지 않아도 컴파일러가 알아서 해줌
    
    - object 패키지가 여기 있음

- webapp
  
  - 배포시 만든 프로젝트와 동일

- WEB-INF/lib
  
  - 프로젝트에서 사용하는 라이브러리가 저장됨



- 패키지를 만드는 이유
  
  - 이름충돌, 클래스 충돌 방지
  
  - 기업별로 지침이 있음



Tomcat 9.0 -> WAS서버로 사용 [WEB과 WAS 둘다 대체 가능]

- port
  
  - 외부와 정보를 주고받을 수 있는 통로
  
  - 500번대 - 서버오류
  
  - 400번대 - 찾는 페이지가 없음

- src/main/java
  
  - -> java파일이 모여있는 곳
  
  - -> 패키지를 생성해 관리
  
  - -> Java Resources
  
  - ex) com.[name].[name]..... 이런식으로 패키지명을 설정해준다com.springstudy.bbs.controller

- src
  
  - web관련 내용이 들어있음
  
  - root폴더

- Value Object (VO)
  
  - DB에서 값을 받아올때 사용하는 패키지



- Servlet
  
  - 요청에 따라 움직임

- Tomcat - 부모컨테이너

- Dynamic Web Project - 자식컨테이너



- 개발자 도구 활용
  
  - Network -> Name -> payload
    
    - 넘어가는 파라미터를 확인 가능

-----------------------

- HttpServlet
  
  - service메소드
  
  - Get방식 (doGet), Post방식(doPost) 지원

- 태그 속성
  
  - input(text), textarea는 value값을 보내는 형식이 같다
  
  - select(multiple) -> 복수 선택 가능
  
  - HttpServletRequest, HttpServletResponse는 일회성임
    
    - 요청, 연결을 한번하고 끊김

- WebServlet
  
  - web.xml에 등록하는 것과 같음

-----------------------------

## 3Tier Architecture

- **3**계층 **아키텍처**는 애플리케이션을 프레젠테이션 계층 또는 사용자 인터페이스, 데이터가 처리되는 애플리케이션 계층 그리고 애플리케이션과 관련된 데이터가 저장 및 관리되는 데이터 계층이라는 **3**개의 논리적이고 물리적인 컴퓨팅 계층으로 구성하는 확립된 소프트웨어 애플리케이션 **아키텍처**입니다.



## 객체지향 5대원칙 **(SOILD 원칙)**

### 1. 단일 책임 원칙 (Single Responsiblity Principle)

모든 클래스는 각각 하나의 책임만 가져야 한다. 클래스는 그 책임을 완전히 캡슐화해야 함을 말한다.

- 사칙연산 함수를 가지고 있는 계산 클래스가 있다고 치자. 이 상태의 계산 클래스는 오직 사칙연산 기능만을 책임진다. 이 클래스를 수정한다고 한다면 그 이유는 사칙연산 함수와 관련된 문제일 뿐이다.

### 2. 개방-폐쇄 원칙 (Open Closed Principle)

확장에는 열려있고 수정에는 닫혀있는. 기존의 코드를 변경하지 않으면서( Closed), 기능을 추가할 수 있도록(Open) 설계가 되어야 한다는 원칙을 말한다.

- 캐릭터를 하나 생성한다고 할때, 각각의 캐릭터가 움직임이 다를 경우 움직임의 패턴 구현을 하위 클래스에 맡긴다면 캐릭터 클래스의 수정은 필요가없고(Closed) 움직임의 패턴만 재정의 하면 된다.(Open)

### 3. 리스코프 치환 원칙 (**Liskov Substitution Principle)**

자식 클래스는 언제나 자신의 부모 클래스를 대체할 수 있다는 원칙이다. 즉 부모 클래스가 들어갈 자리에 자식 클래스를 넣어도 계획대로 잘 작동해야 한다.

자식클래스는 부모 클래스의 책임을 무시하거나 재정의하지 않고 확장만 수행하도록 해야 LSP (Liskov Substitution Principle) 를 만족한다.

### 4. 인터페이스 분리 원칙 (Interface Segregation Principle)

한 클래스는 자신이 사용하지않는 인터페이스는 구현하지 말아야 한다. 하나의 일반적인 인터페이스보다 여러개의 구체적인 인터페이스가 낫다.

### 5. 의존 역전 원칙 (Dependency Inversion Principle)

의존 관계를 맺을 때 변화하기 쉬운 것 또는 자주 변화하는 것보다는 변화하기 어려운 것, 거의 변화가 없는 것에 의존하라는 것이다. 한마디로 구체적인 클래스보다 인터페이스나 추상 클래스와 관계를 맺으라는 것이다.

-------------------

- JNDI (Java Naming and Directory Interface)
  
  - 디렉토리 서비스에서 제공하는 데이터 및 객체를 발견하고 참고 (Look up)하기 위한 JAVA API. (외부 객체를 가져오기 위한 기술)

--------------------------------

- e.preventDefault();

- return false();
  
  - 둘다 이벤트가 submit가 될때 상위요소에서 하위요소에 전파되는 이벤트를 막는다
  
  - $("[id]").focus(); ==> 다시 이벤트 발생

---------------------------------------

- Oracle SQL Developer
  
  - 관리Tool이므로 자동commit이 안됨
  
  - insert시 commit해야 트랜잭션이 끝나면서 작업이 반영됨

- 트랜잭션 Transaction
  
  - 원자성
    
    - 모두 반영되던가, 아예 안되던가
  
  - 일관성
    
    - 작업처리 결과가 항상 일관성이 있어야함
  
  - 독립성
    
    - 어떤 하나의 트랜잭션이라도 다른 트랜잭션의 연산에 끼어들 수 없다
  
  - 지속성
    
    - 트랜잭션이 성공적으로 완료시, 결과 영구 반영

--------------------------------

## Spring 입문

- Bean -> SpringDI에 생성되고 관리되는 객체

Maven -> xml기반

Gradle -> yaml기반

- Bean의 이름을 따로 지정하지 않으면 클래스이름을 Camel Casing한다
  
  - 생성자 외에도 @ (어노테이션) 주입 가능
    
    - private변수로 setter 필요없이 접근 가능 (@Autowried)

- Javax.annotation 패키지
  
  - Java8에는 있는데 Java11에는 없어서 pom.xml에서 의존성 주입을 해야함

- Aspect
  
  - advice + point cut
  
  - joinPoint 메소드의 실행 시점을 지정

-----------------------------------

- Spring 설치
  
  - spring.io사이트에서 springSTS다운
    
    - JDK버전과 STS버전이 다르면 SpringMvcProject를 만들수 없음
    
    - 처음부터 안맞으면 맞는버전을 설치해도 Spring프로젝트 생성 메뉴가 안뜸

- 동일 자바 버전 맞추기
  
  - BuildPath
    
    - Java Compiler
      
      - ProjectFacets
        
        - Dynamic Web Module [version] -> 3.1
        
        - Java -> BuildPath, Java Compiler과 같은 버전으로 맞춰준다
        
        - Runtimes -> ApacheTomcat 9.0

context-param - 전체 초기화 파라미터



- 필터
  
  - 웹브라우저와 Dispathcher Servlet사이의 단계에 존재함

- Handler Adapter
  
  - Dispathcher Servlet과 Controller사이에 있음

- Mapping
  
  - 어떠한 요청을 처리하기 위함



model.Attribute();

-> model에 값을 넣어서 view에 전달

- ViewResolver
  
  - view파일의 긴 구조를 파일명만으로 전달 가능하게끔 해줌
  
  - xml파일에서 설정

- root-context.xml
  
  - Data Access
  
  - DBCP
  
  - SQL Session Factory Bean
    
    - 위 3개를 정의

-------------------------

- servlet-context.xml
  
  - SpringWebMVC 설정 파일 - 어노테이션, ViewResolver 등을 설정
    
    - DispatcherServlet가 읽음

- root-context.xml
  
  - Bean 설정 파일 - DBCP, MyBatis 등을 설정
    
    - Context Loader Listener가 읽음

------------------------------------------

- Persistance FrameWork
  
  - Mybatis, JDBC Template

- JPA - JAVA API 표준 명세서



- MyBatis
  
  - JDBC기반 SQL Mapping FrameWork

- Servlet 기술 3대장
  
  - Servlet
  
  - Encoding
  
  - Filter

- 프로젝트 배포시 한것들 모두
  
  - /WEB-INF/classes 밑으로 들어옴

- DI 컨테이너
  
  - Java객체를 담고 있는 객체
  
  - Web Application Context

- tx ahebf -> JDBC 연결하면 사용가능

----------------------------------

- resultType -> typeAliasesPackage로 설정해주고 남은 뒤의 주소를 적음

- root-context (sqlSessionFactory) - typeAliasesPackage 경로 지정
  
  - BoardMapper.xml (namespace) - sql문 지정
  
  - BoardDaoimpl.java
    
    - NAME_SPACE (경로지정) - BoardMapper.xml에서 지정해준 namespace를 들고옴

-------------

- SessionScope
  
  - 서버(세션)에 저장한 데이터를 들고올 수 있게 해주는 내장함수


