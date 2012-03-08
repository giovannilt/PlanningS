package it.agilis.mens.plannings.core.entity;

import javax.validation.Constraint;

/**
 * Created by IntelliJ IDEA.
 * User: giovannilt
 * Date: 3/8/12
 * Time: 10:10 PM
 * To change this template use File | Settings | File Templates.
 */

@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@Constraint(validatedBy= CheckDelistedStockValidator.class)
public @interface CheckDelistedStock {

}
