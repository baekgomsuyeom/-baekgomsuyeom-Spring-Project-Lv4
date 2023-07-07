package com.springproject.springprojectlv4.repository;

import com.springproject.springprojectlv4.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BoardRepository extends JpaRepository<Board, Long> {
    List<Board> findAllByOrderByCreatedAtDesc();
    Optional<Board> findByIdAndUserId(Long boardId, Long userId);
}

