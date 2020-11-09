/**
 * @author Ishanya.Mittal

 * NIIT Technologies
 * 03/04/2019
 *
 */
package com.demo.hclconnect.MobileConnection.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.hclconnect.MobileNewRequestResponseDTO.EMobileResponseDetailsDTO;


@Repository
public interface EmobileRepository extends JpaRepository<EMobileResponseDetailsDTO, Integer> {

	@Query("select project from Project project where project.projectId=:id")
	EMobileResponseDetailsDTO findByProjectId(@Param("id") Integer projectId);
	
		
}
