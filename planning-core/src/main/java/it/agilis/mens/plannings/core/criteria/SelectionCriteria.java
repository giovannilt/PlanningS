package it.agilis.mens.plannings.core.criteria;

import org.hibernate.criterion.DetachedCriteria;

public interface SelectionCriteria {
    DetachedCriteria getDetachedCriteria();
    void reset();
}
