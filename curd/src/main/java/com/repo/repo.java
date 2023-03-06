package com.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matireal.material;
	@Repository
	public interface  repo extends JpaRepository<material, Long>
{	}
 
