package com.sist.member;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MemberRepository {
	@PersistenceContext
	EntityManager em;
	
	public Long save(Member member) {
		em.persist(member);
		return member.getId();
	}
	public Member find(Long id) {
		return em.find(Member.class, id);
	}

}
