# Python code to change the contrast of image.

from PIL import Image, ImageEnhance

image = Image.open('Q4.jpg')#Image Location
contrast = ImageEnhance.Contrast(image)
contrast.enhance(2).show()
