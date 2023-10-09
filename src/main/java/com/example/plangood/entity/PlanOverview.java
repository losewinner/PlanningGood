package com.example.plangood.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author losewinner
 * @since 2023-10-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PlanOverview implements Serializable {

    private static final long serialVersionUID = 1L;

    private String username;

    private String planname;

    private String plantag;

    private LocalDateTime startTime;

    private LocalDateTime endTime;


}
