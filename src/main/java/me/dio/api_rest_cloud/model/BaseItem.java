package me.dio.api_rest_cloud.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class BaseItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String icon;

    private String description;
}
