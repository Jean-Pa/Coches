package com.project.coches.coches.persistence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.Mapping;

import com.project.coches.coches.domain.pojo.MarcaCochePojo;
import com.project.coches.coches.persistence.entity.MarcaCocheEntity;

@Mapper(componentModel = "spring")
public interface IMarcaCocheMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "description", target = "description")
    })
    MarcaCochePojo toMarcaCochePojo(MarcaCocheEntity marcaCocheEntity);

    @InheritInverseConfiguration
    MarcaCocheEntity toMarcaCocheEntity(MarcaCochePojo marcaCochePojo);

}
