package com.personal.backend.service.image;

import com.personal.backend.dto.ImageDto;
import com.personal.backend.model.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IImageService {
    /**
     * Retrieves an image by its unique identifier.
     *
     * @param id the unique identifier of the image
     * @return the image associated with the given ID
     */
    Image getImageById(Long id);

    /**
     * Deletes an image by its unique identifier.
     *
     * @param id the unique identifier of the image to be deleted
     */
    void deleteImageById(Long id);

    /**
     * Saves a list of images and associates them with a specific product.
     *
     * @param files the list of image files to be saved
     * @param productId the unique identifier of the product to associate the images with
     * @return a list of ImageDto objects representing the saved images
     */
    List<ImageDto> saveImages(Long productId, List<MultipartFile> files);

    /**
     * Updates an existing image with a new file.
     *
     * @param file the new image file to replace the existing one
     * @param imageId the unique identifier of the image to be updated
     */
    void updateImage(MultipartFile file, Long imageId);
}
