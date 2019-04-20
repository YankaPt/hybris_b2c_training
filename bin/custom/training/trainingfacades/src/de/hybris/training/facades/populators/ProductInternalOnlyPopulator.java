package de.hybris.training.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model .product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.training.core.model.ApparelProductModel;

public class ProductInternalOnlyPopulator implements Populator<ProductModel, ProductData>
{
    @Override
    public void populate(final ProductModel source, final ProductData target) throws ConversionException
    {
        if (source instanceof ApparelProductModel) {
            target.setInternalOnly(((ApparelProductModel)source).getInternalOnly() != null && ((ApparelProductModel)source).getInternalOnly());
        }
    }
}
