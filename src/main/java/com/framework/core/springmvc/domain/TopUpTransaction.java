package com.framework.core.springmvc.domain;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "Topup")
public class TopUpTransaction extends Transaction {
}
