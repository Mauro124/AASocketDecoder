/*************************************************************/
/* Copyright (C) 2017 OSS Nokalva, Inc.  All rights reserved.*/
/*************************************************************/

/* THIS FILE IS PROPRIETARY MATERIAL OF OSS NOKALVA, INC.
 * AND MAY BE USED ONLY BY DIRECT LICENSEES OF OSS NOKALVA, INC.
 * THIS FILE MAY NOT BE DISTRIBUTED.
 * THIS COPYRIGHT STATEMENT MAY NOT BE REMOVED. */

/* Generated for: SAS Institute Argentina S.A., Buenos Aires - Project-based, License 16288 16288,
 * only for project "Developed solutions (Products) and services for Customer's Customer A - Telefonica Moviles del Uruguay Sociedad Anonima". */
/* Abstract syntax: notificacionexternas */
/* ASN.1 Java project: notificacionexternas.Notificacionexternas */
/* Created: Mon Dec 11 16:05:39 2017 */
/* ASN.1 Compiler for Java version: 7.0 */
/* ASN.1 compiler options and file names specified:
 * -output notificacionexternas -ber -der -cer -root -noSampleCode
 * -messageFormat msvc /home/osboxes/Mauro/notificacionExternas.asn
 */


package notificacionexternas.ppif_interfazexterna;

import com.oss.asn1.*;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type ParamsEspecificos from ASN1 Module PPIF_INTERFAZEXTERNA.
 * @see Choice
 */

public class ParamsEspecificos extends Choice {

    /**
     * The default constructor.
     */
    public ParamsEspecificos()
    {
    }

    public static final  int  recarga_chosen = 1;
    public static final  int  bono_chosen = 2;
    public static final  int  altaPeriod_chosen = 3;
    public static final  int  ajuste_chosen = 4;
    public static final  int  cyclicAction_chosen = 5;
    public static final  int  tariffChange_chosen = 6;
    public static final  int  renBonoTR_chosen = 7;
    public static final  int  boltonEvent_chosen = 8;
    public static final  int  bajaBono_chosen = 9;
    public static final  int  bajaPeriodificacion_chosen = 10;
    public static final  int  homeZone_chosen = 11;
    public static final  int  promocionEBC_chosen = 12;
    public static final  int  estadoPeriodificacion_chosen = 13;
    public static final  int  cambioFechaPeriodif_chosen = 14;
    public static final  int  limiteconsumociclo_chosen = 15;
    public static final  int  calidadServicio_chosen = 16;
    public static final  int  producto_chosen = 17;
    public static final  int  controlGasto_chosen = 18;
    public static final  int  cardChange_chosen = 19;
    public static final  int  walletThresholdEvent_chosen = 20;

    // Methods for field "recarga"
    public static ParamsEspecificos createParamsEspecificosWithRecarga(Recarga recarga)
    {
	ParamsEspecificos __object = new ParamsEspecificos();

	__object.setRecarga(recarga);
	return __object;
    }

    public boolean hasRecarga()
    {
	return getChosenFlag() == recarga_chosen;
    }

    public Recarga getRecarga()
    {
	if (hasRecarga())
	    return (Recarga)mChosenValue;
	else
	    return null;
    }

    public void setRecarga(Recarga recarga)
    {
	setChosenValue(recarga);
	setChosenFlag(recarga_chosen);
    }


    // Methods for field "bono"
    public static ParamsEspecificos createParamsEspecificosWithBono(Bono bono)
    {
	ParamsEspecificos __object = new ParamsEspecificos();

	__object.setBono(bono);
	return __object;
    }

    public boolean hasBono()
    {
	return getChosenFlag() == bono_chosen;
    }

    public Bono getBono()
    {
	if (hasBono())
	    return (Bono)mChosenValue;
	else
	    return null;
    }

    public void setBono(Bono bono)
    {
	setChosenValue(bono);
	setChosenFlag(bono_chosen);
    }


    // Methods for field "altaPeriod"
    public static ParamsEspecificos createParamsEspecificosWithAltaPeriod(AltaPeriodificacion altaPeriod)
    {
	ParamsEspecificos __object = new ParamsEspecificos();

	__object.setAltaPeriod(altaPeriod);
	return __object;
    }

    public boolean hasAltaPeriod()
    {
	return getChosenFlag() == altaPeriod_chosen;
    }

    public AltaPeriodificacion getAltaPeriod()
    {
	if (hasAltaPeriod())
	    return (AltaPeriodificacion)mChosenValue;
	else
	    return null;
    }

    public void setAltaPeriod(AltaPeriodificacion altaPeriod)
    {
	setChosenValue(altaPeriod);
	setChosenFlag(altaPeriod_chosen);
    }


    // Methods for field "ajuste"
    public static ParamsEspecificos createParamsEspecificosWithAjuste(Ajuste ajuste)
    {
	ParamsEspecificos __object = new ParamsEspecificos();

	__object.setAjuste(ajuste);
	return __object;
    }

    public boolean hasAjuste()
    {
	return getChosenFlag() == ajuste_chosen;
    }

    public Ajuste getAjuste()
    {
	if (hasAjuste())
	    return (Ajuste)mChosenValue;
	else
	    return null;
    }

    public void setAjuste(Ajuste ajuste)
    {
	setChosenValue(ajuste);
	setChosenFlag(ajuste_chosen);
    }


    // Methods for field "cyclicAction"
    public static ParamsEspecificos createParamsEspecificosWithCyclicAction(CyclicAction cyclicAction)
    {
	ParamsEspecificos __object = new ParamsEspecificos();

	__object.setCyclicAction(cyclicAction);
	return __object;
    }

    public boolean hasCyclicAction()
    {
	return getChosenFlag() == cyclicAction_chosen;
    }

    public CyclicAction getCyclicAction()
    {
	if (hasCyclicAction())
	    return (CyclicAction)mChosenValue;
	else
	    return null;
    }

    public void setCyclicAction(CyclicAction cyclicAction)
    {
	setChosenValue(cyclicAction);
	setChosenFlag(cyclicAction_chosen);
    }


    // Methods for field "tariffChange"
    public static ParamsEspecificos createParamsEspecificosWithTariffChange(TariffChange tariffChange)
    {
	ParamsEspecificos __object = new ParamsEspecificos();

	__object.setTariffChange(tariffChange);
	return __object;
    }

    public boolean hasTariffChange()
    {
	return getChosenFlag() == tariffChange_chosen;
    }

    public TariffChange getTariffChange()
    {
	if (hasTariffChange())
	    return (TariffChange)mChosenValue;
	else
	    return null;
    }

    public void setTariffChange(TariffChange tariffChange)
    {
	setChosenValue(tariffChange);
	setChosenFlag(tariffChange_chosen);
    }


    // Methods for field "renBonoTR"
    public static ParamsEspecificos createParamsEspecificosWithRenBonoTR(RenBonoTR renBonoTR)
    {
	ParamsEspecificos __object = new ParamsEspecificos();

	__object.setRenBonoTR(renBonoTR);
	return __object;
    }

    public boolean hasRenBonoTR()
    {
	return getChosenFlag() == renBonoTR_chosen;
    }

    public RenBonoTR getRenBonoTR()
    {
	if (hasRenBonoTR())
	    return (RenBonoTR)mChosenValue;
	else
	    return null;
    }

    public void setRenBonoTR(RenBonoTR renBonoTR)
    {
	setChosenValue(renBonoTR);
	setChosenFlag(renBonoTR_chosen);
    }


    // Methods for field "boltonEvent"
    public static ParamsEspecificos createParamsEspecificosWithBoltonEvent(BoltonEvent boltonEvent)
    {
	ParamsEspecificos __object = new ParamsEspecificos();

	__object.setBoltonEvent(boltonEvent);
	return __object;
    }

    public boolean hasBoltonEvent()
    {
	return getChosenFlag() == boltonEvent_chosen;
    }

    public BoltonEvent getBoltonEvent()
    {
	if (hasBoltonEvent())
	    return (BoltonEvent)mChosenValue;
	else
	    return null;
    }

    public void setBoltonEvent(BoltonEvent boltonEvent)
    {
	setChosenValue(boltonEvent);
	setChosenFlag(boltonEvent_chosen);
    }


    // Methods for field "bajaBono"
    public static ParamsEspecificos createParamsEspecificosWithBajaBono(BajaBono bajaBono)
    {
	ParamsEspecificos __object = new ParamsEspecificos();

	__object.setBajaBono(bajaBono);
	return __object;
    }

    public boolean hasBajaBono()
    {
	return getChosenFlag() == bajaBono_chosen;
    }

    public BajaBono getBajaBono()
    {
	if (hasBajaBono())
	    return (BajaBono)mChosenValue;
	else
	    return null;
    }

    public void setBajaBono(BajaBono bajaBono)
    {
	setChosenValue(bajaBono);
	setChosenFlag(bajaBono_chosen);
    }


    // Methods for field "bajaPeriodificacion"
    public static ParamsEspecificos createParamsEspecificosWithBajaPeriodificacion(BajaPeriodificacion bajaPeriodificacion)
    {
	ParamsEspecificos __object = new ParamsEspecificos();

	__object.setBajaPeriodificacion(bajaPeriodificacion);
	return __object;
    }

    public boolean hasBajaPeriodificacion()
    {
	return getChosenFlag() == bajaPeriodificacion_chosen;
    }

    public BajaPeriodificacion getBajaPeriodificacion()
    {
	if (hasBajaPeriodificacion())
	    return (BajaPeriodificacion)mChosenValue;
	else
	    return null;
    }

    public void setBajaPeriodificacion(BajaPeriodificacion bajaPeriodificacion)
    {
	setChosenValue(bajaPeriodificacion);
	setChosenFlag(bajaPeriodificacion_chosen);
    }


    // Methods for field "homeZone"
    public static ParamsEspecificos createParamsEspecificosWithHomeZone(HomeZone homeZone)
    {
	ParamsEspecificos __object = new ParamsEspecificos();

	__object.setHomeZone(homeZone);
	return __object;
    }

    public boolean hasHomeZone()
    {
	return getChosenFlag() == homeZone_chosen;
    }

    public HomeZone getHomeZone()
    {
	if (hasHomeZone())
	    return (HomeZone)mChosenValue;
	else
	    return null;
    }

    public void setHomeZone(HomeZone homeZone)
    {
	setChosenValue(homeZone);
	setChosenFlag(homeZone_chosen);
    }


    // Methods for field "promocionEBC"
    public static ParamsEspecificos createParamsEspecificosWithPromocionEBC(PromocionEBC promocionEBC)
    {
	ParamsEspecificos __object = new ParamsEspecificos();

	__object.setPromocionEBC(promocionEBC);
	return __object;
    }

    public boolean hasPromocionEBC()
    {
	return getChosenFlag() == promocionEBC_chosen;
    }

    public PromocionEBC getPromocionEBC()
    {
	if (hasPromocionEBC())
	    return (PromocionEBC)mChosenValue;
	else
	    return null;
    }

    public void setPromocionEBC(PromocionEBC promocionEBC)
    {
	setChosenValue(promocionEBC);
	setChosenFlag(promocionEBC_chosen);
    }


    // Methods for field "estadoPeriodificacion"
    public static ParamsEspecificos createParamsEspecificosWithEstadoPeriodificacion(EstadoPeriodificacion estadoPeriodificacion)
    {
	ParamsEspecificos __object = new ParamsEspecificos();

	__object.setEstadoPeriodificacion(estadoPeriodificacion);
	return __object;
    }

    public boolean hasEstadoPeriodificacion()
    {
	return getChosenFlag() == estadoPeriodificacion_chosen;
    }

    public EstadoPeriodificacion getEstadoPeriodificacion()
    {
	if (hasEstadoPeriodificacion())
	    return (EstadoPeriodificacion)mChosenValue;
	else
	    return null;
    }

    public void setEstadoPeriodificacion(EstadoPeriodificacion estadoPeriodificacion)
    {
	setChosenValue(estadoPeriodificacion);
	setChosenFlag(estadoPeriodificacion_chosen);
    }


    // Methods for field "cambioFechaPeriodif"
    public static ParamsEspecificos createParamsEspecificosWithCambioFechaPeriodif(CambioFechaPeriodif cambioFechaPeriodif)
    {
	ParamsEspecificos __object = new ParamsEspecificos();

	__object.setCambioFechaPeriodif(cambioFechaPeriodif);
	return __object;
    }

    public boolean hasCambioFechaPeriodif()
    {
	return getChosenFlag() == cambioFechaPeriodif_chosen;
    }

    public CambioFechaPeriodif getCambioFechaPeriodif()
    {
	if (hasCambioFechaPeriodif())
	    return (CambioFechaPeriodif)mChosenValue;
	else
	    return null;
    }

    public void setCambioFechaPeriodif(CambioFechaPeriodif cambioFechaPeriodif)
    {
	setChosenValue(cambioFechaPeriodif);
	setChosenFlag(cambioFechaPeriodif_chosen);
    }


    // Methods for field "limiteconsumociclo"
    public static ParamsEspecificos createParamsEspecificosWithLimiteconsumociclo(LimiteConsumoCiclo limiteconsumociclo)
    {
	ParamsEspecificos __object = new ParamsEspecificos();

	__object.setLimiteconsumociclo(limiteconsumociclo);
	return __object;
    }

    public boolean hasLimiteconsumociclo()
    {
	return getChosenFlag() == limiteconsumociclo_chosen;
    }

    public LimiteConsumoCiclo getLimiteconsumociclo()
    {
	if (hasLimiteconsumociclo())
	    return (LimiteConsumoCiclo)mChosenValue;
	else
	    return null;
    }

    public void setLimiteconsumociclo(LimiteConsumoCiclo limiteconsumociclo)
    {
	setChosenValue(limiteconsumociclo);
	setChosenFlag(limiteconsumociclo_chosen);
    }


    // Methods for field "calidadServicio"
    public static ParamsEspecificos createParamsEspecificosWithCalidadServicio(CalidadServicio calidadServicio)
    {
	ParamsEspecificos __object = new ParamsEspecificos();

	__object.setCalidadServicio(calidadServicio);
	return __object;
    }

    public boolean hasCalidadServicio()
    {
	return getChosenFlag() == calidadServicio_chosen;
    }

    public CalidadServicio getCalidadServicio()
    {
	if (hasCalidadServicio())
	    return (CalidadServicio)mChosenValue;
	else
	    return null;
    }

    public void setCalidadServicio(CalidadServicio calidadServicio)
    {
	setChosenValue(calidadServicio);
	setChosenFlag(calidadServicio_chosen);
    }


    // Methods for field "producto"
    public static ParamsEspecificos createParamsEspecificosWithProducto(Producto producto)
    {
	ParamsEspecificos __object = new ParamsEspecificos();

	__object.setProducto(producto);
	return __object;
    }

    public boolean hasProducto()
    {
	return getChosenFlag() == producto_chosen;
    }

    public Producto getProducto()
    {
	if (hasProducto())
	    return (Producto)mChosenValue;
	else
	    return null;
    }

    public void setProducto(Producto producto)
    {
	setChosenValue(producto);
	setChosenFlag(producto_chosen);
    }


    // Methods for field "controlGasto"
    public static ParamsEspecificos createParamsEspecificosWithControlGasto(ControlGasto controlGasto)
    {
	ParamsEspecificos __object = new ParamsEspecificos();

	__object.setControlGasto(controlGasto);
	return __object;
    }

    public boolean hasControlGasto()
    {
	return getChosenFlag() == controlGasto_chosen;
    }

    public ControlGasto getControlGasto()
    {
	if (hasControlGasto())
	    return (ControlGasto)mChosenValue;
	else
	    return null;
    }

    public void setControlGasto(ControlGasto controlGasto)
    {
	setChosenValue(controlGasto);
	setChosenFlag(controlGasto_chosen);
    }


    // Methods for field "cardChange"
    public static ParamsEspecificos createParamsEspecificosWithCardChange(CardChange cardChange)
    {
	ParamsEspecificos __object = new ParamsEspecificos();

	__object.setCardChange(cardChange);
	return __object;
    }

    public boolean hasCardChange()
    {
	return getChosenFlag() == cardChange_chosen;
    }

    public CardChange getCardChange()
    {
	if (hasCardChange())
	    return (CardChange)mChosenValue;
	else
	    return null;
    }

    public void setCardChange(CardChange cardChange)
    {
	setChosenValue(cardChange);
	setChosenFlag(cardChange_chosen);
    }


    // Methods for field "walletThresholdEvent"
    public static ParamsEspecificos createParamsEspecificosWithWalletThresholdEvent(WalletThresholdEvent walletThresholdEvent)
    {
	ParamsEspecificos __object = new ParamsEspecificos();

	__object.setWalletThresholdEvent(walletThresholdEvent);
	return __object;
    }

    public boolean hasWalletThresholdEvent()
    {
	return getChosenFlag() == walletThresholdEvent_chosen;
    }

    public WalletThresholdEvent getWalletThresholdEvent()
    {
	if (hasWalletThresholdEvent())
	    return (WalletThresholdEvent)mChosenValue;
	else
	    return null;
    }

    public void setWalletThresholdEvent(WalletThresholdEvent walletThresholdEvent)
    {
	setChosenValue(walletThresholdEvent);
	setChosenFlag(walletThresholdEvent_chosen);
    }


    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case recarga_chosen:
		return new Recarga();
	    case bono_chosen:
		return new Bono();
	    case altaPeriod_chosen:
		return new AltaPeriodificacion();
	    case ajuste_chosen:
		return new Ajuste();
	    case cyclicAction_chosen:
		return new CyclicAction();
	    case tariffChange_chosen:
		return new TariffChange();
	    case renBonoTR_chosen:
		return new RenBonoTR();
	    case boltonEvent_chosen:
		return new BoltonEvent();
	    case bajaBono_chosen:
		return new BajaBono();
	    case bajaPeriodificacion_chosen:
		return new BajaPeriodificacion();
	    case homeZone_chosen:
		return new HomeZone();
	    case promocionEBC_chosen:
		return new PromocionEBC();
	    case estadoPeriodificacion_chosen:
		return new EstadoPeriodificacion();
	    case cambioFechaPeriodif_chosen:
		return new CambioFechaPeriodif();
	    case limiteconsumociclo_chosen:
		return new LimiteConsumoCiclo();
	    case calidadServicio_chosen:
		return new CalidadServicio();
	    case producto_chosen:
		return new Producto();
	    case controlGasto_chosen:
		return new ControlGasto();
	    case cardChange_chosen:
		return new CardChange();
	    case walletThresholdEvent_chosen:
		return new WalletThresholdEvent();
	    default:
		throw new InternalError("Choice.createInstance()");
	}

    }

    /**
     * Initialize the type descriptor.
     */
    private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	new Tags (
	    null
	),
	new QName (
	    "notificacionexternas.ppif_interfazexterna",
	    "ParamsEspecificos"
	),
	new QName (
	    "PPIF-INTERFAZEXTERNA",
	    "ParamsEspecificos"
	),
	798739,
	null,
	new FieldsList (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"notificacionexternas.ppif_interfazexterna",
				"Recarga"
			    ),
			    new QName (
				"PPIF-INTERFAZEXTERNA",
				"Recarga"
			    ),
			    798739,
			    null,
			    new FieldsRef (
				new QName (
				    "notificacionexternas.ppif_interfazexterna",
				    "Recarga"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "notificacionexternas.ppif_interfazexterna",
				    "Recarga"
				)
			    ),
			    0
			)
		    ),
		    "recarga",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"notificacionexternas.ppif_interfazexterna",
				"Bono"
			    ),
			    new QName (
				"PPIF-INTERFAZEXTERNA",
				"Bono"
			    ),
			    798739,
			    null,
			    new FieldsRef (
				new QName (
				    "notificacionexternas.ppif_interfazexterna",
				    "Bono"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "notificacionexternas.ppif_interfazexterna",
				    "Bono"
				)
			    ),
			    0
			)
		    ),
		    "bono",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"notificacionexternas.ppif_interfazexterna",
				"AltaPeriodificacion"
			    ),
			    new QName (
				"PPIF-INTERFAZEXTERNA",
				"AltaPeriodificacion"
			    ),
			    798739,
			    null,
			    new FieldsRef (
				new QName (
				    "notificacionexternas.ppif_interfazexterna",
				    "AltaPeriodificacion"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "notificacionexternas.ppif_interfazexterna",
				    "AltaPeriodificacion"
				)
			    ),
			    0
			)
		    ),
		    "altaPeriod",
		    2,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"notificacionexternas.ppif_interfazexterna",
				"Ajuste"
			    ),
			    new QName (
				"PPIF-INTERFAZEXTERNA",
				"Ajuste"
			    ),
			    798739,
			    null,
			    new FieldsRef (
				new QName (
				    "notificacionexternas.ppif_interfazexterna",
				    "Ajuste"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "notificacionexternas.ppif_interfazexterna",
				    "Ajuste"
				)
			    ),
			    0
			)
		    ),
		    "ajuste",
		    3,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"notificacionexternas.ppif_interfazexterna",
				"CyclicAction"
			    ),
			    new QName (
				"PPIF-INTERFAZEXTERNA",
				"CyclicAction"
			    ),
			    798739,
			    null,
			    new FieldsRef (
				new QName (
				    "notificacionexternas.ppif_interfazexterna",
				    "CyclicAction"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "notificacionexternas.ppif_interfazexterna",
				    "CyclicAction"
				)
			    ),
			    0
			)
		    ),
		    "cyclicAction",
		    4,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"notificacionexternas.ppif_interfazexterna",
				"TariffChange"
			    ),
			    new QName (
				"PPIF-INTERFAZEXTERNA",
				"TariffChange"
			    ),
			    798739,
			    null,
			    new FieldsRef (
				new QName (
				    "notificacionexternas.ppif_interfazexterna",
				    "TariffChange"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "notificacionexternas.ppif_interfazexterna",
				    "TariffChange"
				)
			    ),
			    0
			)
		    ),
		    "tariffChange",
		    5,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"notificacionexternas.ppif_interfazexterna",
				"RenBonoTR"
			    ),
			    new QName (
				"PPIF-INTERFAZEXTERNA",
				"RenBonoTR"
			    ),
			    798739,
			    null,
			    new FieldsRef (
				new QName (
				    "notificacionexternas.ppif_interfazexterna",
				    "RenBonoTR"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "notificacionexternas.ppif_interfazexterna",
				    "RenBonoTR"
				)
			    ),
			    0
			)
		    ),
		    "renBonoTR",
		    6,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
				}
			    ),
			    new QName (
				"notificacionexternas.ppif_interfazexterna",
				"BoltonEvent"
			    ),
			    new QName (
				"PPIF-INTERFAZEXTERNA",
				"BoltonEvent"
			    ),
			    798739,
			    null,
			    new FieldsRef (
				new QName (
				    "notificacionexternas.ppif_interfazexterna",
				    "BoltonEvent"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "notificacionexternas.ppif_interfazexterna",
				    "BoltonEvent"
				)
			    ),
			    0
			)
		    ),
		    "boltonEvent",
		    7,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
				}
			    ),
			    new QName (
				"notificacionexternas.ppif_interfazexterna",
				"BajaBono"
			    ),
			    new QName (
				"PPIF-INTERFAZEXTERNA",
				"BajaBono"
			    ),
			    798739,
			    null,
			    new FieldsRef (
				new QName (
				    "notificacionexternas.ppif_interfazexterna",
				    "BajaBono"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "notificacionexternas.ppif_interfazexterna",
				    "BajaBono"
				)
			    ),
			    0
			)
		    ),
		    "bajaBono",
		    8,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x800a
				}
			    ),
			    new QName (
				"notificacionexternas.ppif_interfazexterna",
				"BajaPeriodificacion"
			    ),
			    new QName (
				"PPIF-INTERFAZEXTERNA",
				"BajaPeriodificacion"
			    ),
			    798739,
			    null,
			    new FieldsRef (
				new QName (
				    "notificacionexternas.ppif_interfazexterna",
				    "BajaPeriodificacion"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "notificacionexternas.ppif_interfazexterna",
				    "BajaPeriodificacion"
				)
			    ),
			    0
			)
		    ),
		    "bajaPeriodificacion",
		    9,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x800b
				}
			    ),
			    new QName (
				"notificacionexternas.ppif_interfazexterna",
				"HomeZone"
			    ),
			    new QName (
				"PPIF-INTERFAZEXTERNA",
				"HomeZone"
			    ),
			    798739,
			    null,
			    new FieldsRef (
				new QName (
				    "notificacionexternas.ppif_interfazexterna",
				    "HomeZone"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "notificacionexternas.ppif_interfazexterna",
				    "HomeZone"
				)
			    ),
			    0
			)
		    ),
		    "homeZone",
		    10,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x800c
				}
			    ),
			    new QName (
				"notificacionexternas.ppif_interfazexterna",
				"PromocionEBC"
			    ),
			    new QName (
				"PPIF-INTERFAZEXTERNA",
				"PromocionEBC"
			    ),
			    798739,
			    null,
			    new FieldsRef (
				new QName (
				    "notificacionexternas.ppif_interfazexterna",
				    "PromocionEBC"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "notificacionexternas.ppif_interfazexterna",
				    "PromocionEBC"
				)
			    ),
			    0
			)
		    ),
		    "promocionEBC",
		    11,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x800d
				}
			    ),
			    new QName (
				"notificacionexternas.ppif_interfazexterna",
				"EstadoPeriodificacion"
			    ),
			    new QName (
				"PPIF-INTERFAZEXTERNA",
				"EstadoPeriodificacion"
			    ),
			    798739,
			    null,
			    new FieldsRef (
				new QName (
				    "notificacionexternas.ppif_interfazexterna",
				    "EstadoPeriodificacion"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "notificacionexternas.ppif_interfazexterna",
				    "EstadoPeriodificacion"
				)
			    ),
			    0
			)
		    ),
		    "estadoPeriodificacion",
		    12,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x800e
				}
			    ),
			    new QName (
				"notificacionexternas.ppif_interfazexterna",
				"CambioFechaPeriodif"
			    ),
			    new QName (
				"PPIF-INTERFAZEXTERNA",
				"CambioFechaPeriodif"
			    ),
			    798739,
			    null,
			    new FieldsRef (
				new QName (
				    "notificacionexternas.ppif_interfazexterna",
				    "CambioFechaPeriodif"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "notificacionexternas.ppif_interfazexterna",
				    "CambioFechaPeriodif"
				)
			    ),
			    0
			)
		    ),
		    "cambioFechaPeriodif",
		    13,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x800f
				}
			    ),
			    new QName (
				"notificacionexternas.ppif_interfazexterna",
				"LimiteConsumoCiclo"
			    ),
			    new QName (
				"PPIF-INTERFAZEXTERNA",
				"LimiteConsumoCiclo"
			    ),
			    798739,
			    null,
			    new FieldsRef (
				new QName (
				    "notificacionexternas.ppif_interfazexterna",
				    "LimiteConsumoCiclo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "notificacionexternas.ppif_interfazexterna",
				    "LimiteConsumoCiclo"
				)
			    ),
			    0
			)
		    ),
		    "limiteconsumociclo",
		    14,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8010
				}
			    ),
			    new QName (
				"notificacionexternas.ppif_interfazexterna",
				"CalidadServicio"
			    ),
			    new QName (
				"PPIF-INTERFAZEXTERNA",
				"CalidadServicio"
			    ),
			    798739,
			    null,
			    new FieldsRef (
				new QName (
				    "notificacionexternas.ppif_interfazexterna",
				    "CalidadServicio"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "notificacionexternas.ppif_interfazexterna",
				    "CalidadServicio"
				)
			    ),
			    0
			)
		    ),
		    "calidadServicio",
		    15,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8011
				}
			    ),
			    new QName (
				"notificacionexternas.ppif_interfazexterna",
				"Producto"
			    ),
			    new QName (
				"PPIF-INTERFAZEXTERNA",
				"Producto"
			    ),
			    798739,
			    null,
			    new FieldsRef (
				new QName (
				    "notificacionexternas.ppif_interfazexterna",
				    "Producto"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "notificacionexternas.ppif_interfazexterna",
				    "Producto"
				)
			    ),
			    0
			)
		    ),
		    "producto",
		    16,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8012
				}
			    ),
			    new QName (
				"notificacionexternas.ppif_interfazexterna",
				"ControlGasto"
			    ),
			    new QName (
				"PPIF-INTERFAZEXTERNA",
				"ControlGasto"
			    ),
			    798739,
			    null,
			    new FieldsRef (
				new QName (
				    "notificacionexternas.ppif_interfazexterna",
				    "ControlGasto"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "notificacionexternas.ppif_interfazexterna",
				    "ControlGasto"
				)
			    ),
			    0
			)
		    ),
		    "controlGasto",
		    17,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8014
				}
			    ),
			    new QName (
				"notificacionexternas.ppif_interfazexterna",
				"CardChange"
			    ),
			    new QName (
				"PPIF-INTERFAZEXTERNA",
				"CardChange"
			    ),
			    798739,
			    null,
			    new FieldsRef (
				new QName (
				    "notificacionexternas.ppif_interfazexterna",
				    "CardChange"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "notificacionexternas.ppif_interfazexterna",
				    "CardChange"
				)
			    ),
			    0
			)
		    ),
		    "cardChange",
		    18,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8015
				}
			    ),
			    new QName (
				"notificacionexternas.ppif_interfazexterna",
				"WalletThresholdEvent"
			    ),
			    new QName (
				"PPIF-INTERFAZEXTERNA",
				"WalletThresholdEvent"
			    ),
			    798739,
			    null,
			    new FieldsRef (
				new QName (
				    "notificacionexternas.ppif_interfazexterna",
				    "WalletThresholdEvent"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "notificacionexternas.ppif_interfazexterna",
				    "WalletThresholdEvent"
				)
			    ),
			    0
			)
		    ),
		    "walletThresholdEvent",
		    19,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8001, 0),
		new TagDecoderElement((short)0x8002, 1),
		new TagDecoderElement((short)0x8003, 2),
		new TagDecoderElement((short)0x8004, 3),
		new TagDecoderElement((short)0x8005, 4),
		new TagDecoderElement((short)0x8006, 5),
		new TagDecoderElement((short)0x8007, 6),
		new TagDecoderElement((short)0x8008, 7),
		new TagDecoderElement((short)0x8009, 8),
		new TagDecoderElement((short)0x800a, 9),
		new TagDecoderElement((short)0x800b, 10),
		new TagDecoderElement((short)0x800c, 11),
		new TagDecoderElement((short)0x800d, 12),
		new TagDecoderElement((short)0x800e, 13),
		new TagDecoderElement((short)0x800f, 14),
		new TagDecoderElement((short)0x8010, 15),
		new TagDecoderElement((short)0x8011, 16),
		new TagDecoderElement((short)0x8012, 17),
		new TagDecoderElement((short)0x8014, 18),
		new TagDecoderElement((short)0x8015, 19)
	    }
	)
    );

    /**
     * Get the type descriptor (TypeInfo) of 'this' ParamsEspecificos object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }

    /**
     * Get the static type descriptor (TypeInfo) of 'this' ParamsEspecificos object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }

} // End class definition for ParamsEspecificos
