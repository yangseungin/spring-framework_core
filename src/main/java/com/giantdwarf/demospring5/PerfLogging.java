package com.giantdwarf.demospring5;

import java.lang.annotation.*;

/*
 * 이 애노테이션을 사용하면 성능을 로깅해줌.
* */
//@Retention(RetentionPolicy.CLASS) // source로 변경시 컴파일하고 사라진다 so class인 기본값으로 쓰면됨
@Documented
@Target(ElementType.METHOD)
public @interface PerfLogging {
}
