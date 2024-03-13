package br.com.ibmec.cloud.spotifyclone.repository;

import br.com.ibmec.cloud.spotifyclone.models.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PlaylistRepository extends JpaRepository<Playlist, UUID> {

}
