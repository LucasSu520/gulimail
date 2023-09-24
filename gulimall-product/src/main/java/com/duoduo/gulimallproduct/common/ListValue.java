package com.duoduo.gulimallproduct.common;

import io.swagger.models.auth.In;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;
import javax.validation.constraints.NotNull;
import java.lang.annotation.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(
        validatedBy = {ListValue.ListValueContraint.class}
)
public @interface ListValue {
    String message() default "数据只能在列表中包含";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    int[] value() default {};

    class ListValueContraint implements ConstraintValidator<ListValue, Integer> {

        private Set<Integer> set = new HashSet<>();

        @Override
        public void initialize(ListValue constraintAnnotation) {
            int[] value = constraintAnnotation.value();
            for(int a : value){
                set.add(a);
            }
        }

        @Override
        public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext) {
            return set.contains(integer);
        }
    }
}
