package com.example.backend.service;

import com.example.backend.model.Collection;
import com.example.backend.repository.CollectionRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CollectionServiceTest {
    
    @Mock
    private CollectionRepository collectionRepository;

    @InjectMocks
    private CollectionService collectionService;

    @Test
    public void CollectionService_AddCollection_ReturnsCollection() {
        // Arrange
        Collection collection = Collection.builder()
                .id(1L)  // Using L suffix for Long
                .name("Favorite")
                .build();
            
        when(collectionRepository.save(Mockito.any(Collection.class))).thenReturn(collection);
        
        // Act
        Collection savedCollection = collectionService.addCollection(collection);

        // Assert
        Assertions.assertThat(savedCollection).isNotNull();
        Assertions.assertThat(savedCollection.getId()).isEqualTo(1L);
        Assertions.assertThat(savedCollection.getName()).isEqualTo("Favorite");
    }
}
