package com.personal.backend.service.image;

import com.personal.backend.dto.ImageDto;
import com.personal.backend.model.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IImageService {
    Image getImageById(Long id);
    void deleteImageById(Long id);
    List<ImageDto> saveImages(List<MultipartFile> files, Long productId );
    void updateImage(MultipartFile file, Long imageId );
}
