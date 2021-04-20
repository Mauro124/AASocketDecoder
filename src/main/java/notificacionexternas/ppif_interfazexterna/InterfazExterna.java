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
 * Define the ASN1 Type InterfazExterna from ASN1 Module PPIF_INTERFAZEXTERNA.
 * @see Sequence
 */

public class InterfazExterna extends Sequence {

    /**
     * The default constructor.
     */
    public InterfazExterna()
    {
    }

    /**
     * Construct with AbstractData components.
     */
    public InterfazExterna(PrintableString numTelefono,
		    PrintableString codPromocion, INTEGER impSaldo,
		    INTEGER impCoste, PrintableString codUsuario,
		    PrintableString codEstaPrep,
		    PrintableString codSbEstaPrep,
		    PrintableString codTipPrepa,
		    PrintableString codTecnologia,
		    PrintableString codActuacion, INTEGER codSbActuacion,
		    PrintableString fechaEjecucion, BOOLEAN flagActAnulacion,
		    PrintableString codRechazo, PrintableString secuencia,
		    ParamsEspecificos paramsEspecificos,
		    PrintableString desRechazo, PrintableString mediaType,
		    PrintableString clientTransactionID,
		    PrintableString erReference,
		    PrintableString serviceProvider,
		    PrintableString secuenciaAnul, INTEGER64 impDeuda,
		    PrintableString secuenciaProd, INTEGER64 impCosteNeto,
		    INTEGER64 impImpuesto, BOOLEAN flagDiscountApplied,
		    INTEGER64 realCost, INTEGER discount)
    {
	setNumTelefono(numTelefono);
	setCodPromocion(codPromocion);
	setImpSaldo(impSaldo);
	setImpCoste(impCoste);
	setCodUsuario(codUsuario);
	setCodEstaPrep(codEstaPrep);
	setCodSbEstaPrep(codSbEstaPrep);
	setCodTipPrepa(codTipPrepa);
	setCodTecnologia(codTecnologia);
	setCodActuacion(codActuacion);
	setCodSbActuacion(codSbActuacion);
	setFechaEjecucion(fechaEjecucion);
	setFlagActAnulacion(flagActAnulacion);
	setCodRechazo(codRechazo);
	setSecuencia(secuencia);
	setParamsEspecificos(paramsEspecificos);
	setDesRechazo(desRechazo);
	setMediaType(mediaType);
	setClientTransactionID(clientTransactionID);
	setErReference(erReference);
	setServiceProvider(serviceProvider);
	setSecuenciaAnul(secuenciaAnul);
	setImpDeuda(impDeuda);
	setSecuenciaProd(secuenciaProd);
	setImpCosteNeto(impCosteNeto);
	setImpImpuesto(impImpuesto);
	setFlagDiscountApplied(flagDiscountApplied);
	setRealCost(realCost);
	setDiscount(discount);
    }

    /**
     * Construct with components.
     */
    public InterfazExterna(PrintableString numTelefono,
		    PrintableString codPromocion, long impSaldo,
		    long impCoste, PrintableString codUsuario,
		    PrintableString codEstaPrep,
		    PrintableString codSbEstaPrep,
		    PrintableString codTipPrepa,
		    PrintableString codTecnologia,
		    PrintableString codActuacion, long codSbActuacion,
		    PrintableString fechaEjecucion, boolean flagActAnulacion,
		    PrintableString codRechazo, PrintableString secuencia,
		    ParamsEspecificos paramsEspecificos,
		    PrintableString desRechazo, PrintableString mediaType,
		    PrintableString clientTransactionID,
		    PrintableString erReference,
		    PrintableString serviceProvider,
		    PrintableString secuenciaAnul, INTEGER64 impDeuda,
		    PrintableString secuenciaProd, INTEGER64 impCosteNeto,
		    INTEGER64 impImpuesto, boolean flagDiscountApplied,
		    INTEGER64 realCost, long discount)
    {
	this(numTelefono, codPromocion, new INTEGER(impSaldo),
	     new INTEGER(impCoste), codUsuario, codEstaPrep,
	     codSbEstaPrep, codTipPrepa, codTecnologia, codActuacion,
	     new INTEGER(codSbActuacion), fechaEjecucion,
	     new BOOLEAN(flagActAnulacion), codRechazo, secuencia,
	     paramsEspecificos, desRechazo, mediaType,
	     clientTransactionID, erReference, serviceProvider,
	     secuenciaAnul, impDeuda, secuenciaProd, impCosteNeto,
	     impImpuesto, new BOOLEAN(flagDiscountApplied), realCost,
	     new INTEGER(discount));
    }

    /**
     * Construct with required components.
     */
    public InterfazExterna(PrintableString numTelefono, long impSaldo,
		    long impCoste, PrintableString codUsuario,
		    PrintableString codEstaPrep,
		    PrintableString codSbEstaPrep,
		    PrintableString codTipPrepa,
		    PrintableString codTecnologia,
		    PrintableString codActuacion, long codSbActuacion,
		    PrintableString fechaEjecucion, boolean flagActAnulacion,
		    PrintableString codRechazo, PrintableString secuencia)
    {
	setNumTelefono(numTelefono);
	setImpSaldo(impSaldo);
	setImpCoste(impCoste);
	setCodUsuario(codUsuario);
	setCodEstaPrep(codEstaPrep);
	setCodSbEstaPrep(codSbEstaPrep);
	setCodTipPrepa(codTipPrepa);
	setCodTecnologia(codTecnologia);
	setCodActuacion(codActuacion);
	setCodSbActuacion(codSbActuacion);
	setFechaEjecucion(fechaEjecucion);
	setFlagActAnulacion(flagActAnulacion);
	setCodRechazo(codRechazo);
	setSecuencia(secuencia);
    }

    public void initComponents()
    {
	mComponents[0] = new PrintableString();
	mComponents[1] = new PrintableString();
	mComponents[2] = new INTEGER();
	mComponents[3] = new INTEGER();
	mComponents[4] = new PrintableString();
	mComponents[5] = new PrintableString();
	mComponents[6] = new PrintableString();
	mComponents[7] = new PrintableString();
	mComponents[8] = new PrintableString();
	mComponents[9] = new PrintableString();
	mComponents[10] = new INTEGER();
	mComponents[11] = new PrintableString();
	mComponents[12] = new BOOLEAN();
	mComponents[13] = new PrintableString();
	mComponents[14] = new PrintableString();
	mComponents[15] = new ParamsEspecificos();
	mComponents[16] = new PrintableString();
	mComponents[17] = new PrintableString();
	mComponents[18] = new PrintableString();
	mComponents[19] = new PrintableString();
	mComponents[20] = new PrintableString();
	mComponents[21] = new PrintableString();
	mComponents[22] = new INTEGER64();
	mComponents[23] = new PrintableString();
	mComponents[24] = new INTEGER64();
	mComponents[25] = new INTEGER64();
	mComponents[26] = new BOOLEAN();
	mComponents[27] = new INTEGER64();
	mComponents[28] = new INTEGER();
    }

    // Instance initializer
    {
	mComponents = new AbstractData[29];
    }

    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new PrintableString();
	    case 1:
		return new PrintableString();
	    case 2:
		return new INTEGER();
	    case 3:
		return new INTEGER();
	    case 4:
		return new PrintableString();
	    case 5:
		return new PrintableString();
	    case 6:
		return new PrintableString();
	    case 7:
		return new PrintableString();
	    case 8:
		return new PrintableString();
	    case 9:
		return new PrintableString();
	    case 10:
		return new INTEGER();
	    case 11:
		return new PrintableString();
	    case 12:
		return new BOOLEAN();
	    case 13:
		return new PrintableString();
	    case 14:
		return new PrintableString();
	    case 15:
		return new ParamsEspecificos();
	    case 16:
		return new PrintableString();
	    case 17:
		return new PrintableString();
	    case 18:
		return new PrintableString();
	    case 19:
		return new PrintableString();
	    case 20:
		return new PrintableString();
	    case 21:
		return new PrintableString();
	    case 22:
		return new INTEGER64();
	    case 23:
		return new PrintableString();
	    case 24:
		return new INTEGER64();
	    case 25:
		return new INTEGER64();
	    case 26:
		return new BOOLEAN();
	    case 27:
		return new INTEGER64();
	    case 28:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}

    }


    // Methods for field "numTelefono"
    public PrintableString getNumTelefono()
    {
	return (PrintableString)mComponents[0];
    }

    public void setNumTelefono(PrintableString numTelefono)
    {
	mComponents[0] = numTelefono;
    }


    // Methods for field "codPromocion"
    public PrintableString getCodPromocion()
    {
	return (PrintableString)mComponents[1];
    }

    public void setCodPromocion(PrintableString codPromocion)
    {
	mComponents[1] = codPromocion;
    }

    public boolean hasCodPromocion()
    {
	return componentIsPresent(1);
    }

    public void deleteCodPromocion()
    {
	setComponentAbsent(1);
    }


    // Methods for field "impSaldo"
    public long getImpSaldo()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }

    public void setImpSaldo(long impSaldo)
    {
	setImpSaldo(new INTEGER(impSaldo));
    }

    public void setImpSaldo(INTEGER impSaldo)
    {
	mComponents[2] = impSaldo;
    }


    // Methods for field "impCoste"
    public long getImpCoste()
    {
	return ((INTEGER)mComponents[3]).longValue();
    }

    public void setImpCoste(long impCoste)
    {
	setImpCoste(new INTEGER(impCoste));
    }

    public void setImpCoste(INTEGER impCoste)
    {
	mComponents[3] = impCoste;
    }


    // Methods for field "codUsuario"
    public PrintableString getCodUsuario()
    {
	return (PrintableString)mComponents[4];
    }

    public void setCodUsuario(PrintableString codUsuario)
    {
	mComponents[4] = codUsuario;
    }


    // Methods for field "codEstaPrep"
    public PrintableString getCodEstaPrep()
    {
	return (PrintableString)mComponents[5];
    }

    public void setCodEstaPrep(PrintableString codEstaPrep)
    {
	mComponents[5] = codEstaPrep;
    }


    // Methods for field "codSbEstaPrep"
    public PrintableString getCodSbEstaPrep()
    {
	return (PrintableString)mComponents[6];
    }

    public void setCodSbEstaPrep(PrintableString codSbEstaPrep)
    {
	mComponents[6] = codSbEstaPrep;
    }


    // Methods for field "codTipPrepa"
    public PrintableString getCodTipPrepa()
    {
	return (PrintableString)mComponents[7];
    }

    public void setCodTipPrepa(PrintableString codTipPrepa)
    {
	mComponents[7] = codTipPrepa;
    }


    // Methods for field "codTecnologia"
    public PrintableString getCodTecnologia()
    {
	return (PrintableString)mComponents[8];
    }

    public void setCodTecnologia(PrintableString codTecnologia)
    {
	mComponents[8] = codTecnologia;
    }


    // Methods for field "codActuacion"
    public PrintableString getCodActuacion()
    {
	return (PrintableString)mComponents[9];
    }

    public void setCodActuacion(PrintableString codActuacion)
    {
	mComponents[9] = codActuacion;
    }


    // Methods for field "codSbActuacion"
    public long getCodSbActuacion()
    {
	return ((INTEGER)mComponents[10]).longValue();
    }

    public void setCodSbActuacion(long codSbActuacion)
    {
	setCodSbActuacion(new INTEGER(codSbActuacion));
    }

    public void setCodSbActuacion(INTEGER codSbActuacion)
    {
	mComponents[10] = codSbActuacion;
    }


    // Methods for field "fechaEjecucion"
    public PrintableString getFechaEjecucion()
    {
	return (PrintableString)mComponents[11];
    }

    public void setFechaEjecucion(PrintableString fechaEjecucion)
    {
	mComponents[11] = fechaEjecucion;
    }


    // Methods for field "flagActAnulacion"
    public boolean getFlagActAnulacion()
    {
	return ((BOOLEAN)mComponents[12]).booleanValue();
    }

    public void setFlagActAnulacion(boolean flagActAnulacion)
    {
	setFlagActAnulacion(new BOOLEAN(flagActAnulacion));
    }

    public void setFlagActAnulacion(BOOLEAN flagActAnulacion)
    {
	mComponents[12] = flagActAnulacion;
    }


    // Methods for field "codRechazo"
    public PrintableString getCodRechazo()
    {
	return (PrintableString)mComponents[13];
    }

    public void setCodRechazo(PrintableString codRechazo)
    {
	mComponents[13] = codRechazo;
    }


    // Methods for field "secuencia"
    public PrintableString getSecuencia()
    {
	return (PrintableString)mComponents[14];
    }

    public void setSecuencia(PrintableString secuencia)
    {
	mComponents[14] = secuencia;
    }


    // Methods for field "paramsEspecificos"
    public ParamsEspecificos getParamsEspecificos()
    {
	return (ParamsEspecificos)mComponents[15];
    }

    public void setParamsEspecificos(ParamsEspecificos paramsEspecificos)
    {
	mComponents[15] = paramsEspecificos;
    }

    public boolean hasParamsEspecificos()
    {
	return componentIsPresent(15);
    }

    public void deleteParamsEspecificos()
    {
	setComponentAbsent(15);
    }


    // Methods for field "desRechazo"
    public PrintableString getDesRechazo()
    {
	return (PrintableString)mComponents[16];
    }

    public void setDesRechazo(PrintableString desRechazo)
    {
	mComponents[16] = desRechazo;
    }

    public boolean hasDesRechazo()
    {
	return componentIsPresent(16);
    }

    public void deleteDesRechazo()
    {
	setComponentAbsent(16);
    }


    // Methods for field "mediaType"
    public PrintableString getMediaType()
    {
	return (PrintableString)mComponents[17];
    }

    public void setMediaType(PrintableString mediaType)
    {
	mComponents[17] = mediaType;
    }

    public boolean hasMediaType()
    {
	return componentIsPresent(17);
    }

    public void deleteMediaType()
    {
	setComponentAbsent(17);
    }


    // Methods for field "clientTransactionID"
    public PrintableString getClientTransactionID()
    {
	return (PrintableString)mComponents[18];
    }

    public void setClientTransactionID(PrintableString clientTransactionID)
    {
	mComponents[18] = clientTransactionID;
    }

    public boolean hasClientTransactionID()
    {
	return componentIsPresent(18);
    }

    public void deleteClientTransactionID()
    {
	setComponentAbsent(18);
    }


    // Methods for field "erReference"
    public PrintableString getErReference()
    {
	return (PrintableString)mComponents[19];
    }

    public void setErReference(PrintableString erReference)
    {
	mComponents[19] = erReference;
    }

    public boolean hasErReference()
    {
	return componentIsPresent(19);
    }

    public void deleteErReference()
    {
	setComponentAbsent(19);
    }


    // Methods for field "serviceProvider"
    public PrintableString getServiceProvider()
    {
	return (PrintableString)mComponents[20];
    }

    public void setServiceProvider(PrintableString serviceProvider)
    {
	mComponents[20] = serviceProvider;
    }

    public boolean hasServiceProvider()
    {
	return componentIsPresent(20);
    }

    public void deleteServiceProvider()
    {
	setComponentAbsent(20);
    }


    // Methods for field "secuenciaAnul"
    public PrintableString getSecuenciaAnul()
    {
	return (PrintableString)mComponents[21];
    }

    public void setSecuenciaAnul(PrintableString secuenciaAnul)
    {
	mComponents[21] = secuenciaAnul;
    }

    public boolean hasSecuenciaAnul()
    {
	return componentIsPresent(21);
    }

    public void deleteSecuenciaAnul()
    {
	setComponentAbsent(21);
    }


    // Methods for field "impDeuda"
    public INTEGER64 getImpDeuda()
    {
	return (INTEGER64)mComponents[22];
    }

    public void setImpDeuda(INTEGER64 impDeuda)
    {
	mComponents[22] = impDeuda;
    }

    public boolean hasImpDeuda()
    {
	return componentIsPresent(22);
    }

    public void deleteImpDeuda()
    {
	setComponentAbsent(22);
    }


    // Methods for field "secuenciaProd"
    public PrintableString getSecuenciaProd()
    {
	return (PrintableString)mComponents[23];
    }

    public void setSecuenciaProd(PrintableString secuenciaProd)
    {
	mComponents[23] = secuenciaProd;
    }

    public boolean hasSecuenciaProd()
    {
	return componentIsPresent(23);
    }

    public void deleteSecuenciaProd()
    {
	setComponentAbsent(23);
    }


    // Methods for field "impCosteNeto"
    public INTEGER64 getImpCosteNeto()
    {
	return (INTEGER64)mComponents[24];
    }

    public void setImpCosteNeto(INTEGER64 impCosteNeto)
    {
	mComponents[24] = impCosteNeto;
    }

    public boolean hasImpCosteNeto()
    {
	return componentIsPresent(24);
    }

    public void deleteImpCosteNeto()
    {
	setComponentAbsent(24);
    }


    // Methods for field "impImpuesto"
    public INTEGER64 getImpImpuesto()
    {
	return (INTEGER64)mComponents[25];
    }

    public void setImpImpuesto(INTEGER64 impImpuesto)
    {
	mComponents[25] = impImpuesto;
    }

    public boolean hasImpImpuesto()
    {
	return componentIsPresent(25);
    }

    public void deleteImpImpuesto()
    {
	setComponentAbsent(25);
    }


    // Methods for field "flagDiscountApplied"
    public boolean getFlagDiscountApplied()
    {
	return ((BOOLEAN)mComponents[26]).booleanValue();
    }

    public void setFlagDiscountApplied(boolean flagDiscountApplied)
    {
	setFlagDiscountApplied(new BOOLEAN(flagDiscountApplied));
    }

    public void setFlagDiscountApplied(BOOLEAN flagDiscountApplied)
    {
	mComponents[26] = flagDiscountApplied;
    }

    public boolean hasFlagDiscountApplied()
    {
	return componentIsPresent(26);
    }

    public void deleteFlagDiscountApplied()
    {
	setComponentAbsent(26);
    }


    // Methods for field "realCost"
    public INTEGER64 getRealCost()
    {
	return (INTEGER64)mComponents[27];
    }

    public void setRealCost(INTEGER64 realCost)
    {
	mComponents[27] = realCost;
    }

    public boolean hasRealCost()
    {
	return componentIsPresent(27);
    }

    public void deleteRealCost()
    {
	setComponentAbsent(27);
    }


    // Methods for field "discount"
    public long getDiscount()
    {
	return ((INTEGER)mComponents[28]).longValue();
    }

    public void setDiscount(long discount)
    {
	setDiscount(new INTEGER(discount));
    }

    public void setDiscount(INTEGER discount)
    {
	mComponents[28] = discount;
    }

    public boolean hasDiscount()
    {
	return componentIsPresent(28);
    }

    public void deleteDiscount()
    {
	setComponentAbsent(28);
    }


    /**
     * Initialize the type descriptor.
     */
    private static final SequenceInfo c_typeinfo = new SequenceInfo (
	new Tags (
	    new short[] {
		(short)0x8001
	    }
	),
	new QName (
	    "notificacionexternas.ppif_interfazexterna",
	    "InterfazExterna"
	),
	new QName (
	    "PPIF-INTERFAZEXTERNA",
	    "InterfazExterna"
	),
	798739,
	null,
	new FieldsList (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"PrintableString"
			    ),
			    new QName (
				"builtin",
				"PrintableString"
			    ),
			    798739,
			    new Intersection (
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new INTEGER(1),
					    new INTEGER(21),
					    0
					)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    null,
			    null
			)
		    ),
		    "numTelefono",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"PrintableString"
			    ),
			    new QName (
				"builtin",
				"PrintableString"
			    ),
			    798739,
			    new Intersection (
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new INTEGER(0),
					    new INTEGER(32),
					    0
					)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    null,
			    null
			)
		    ),
		    "codPromocion",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    798739,
			    null,
			    null,
			    null
			)
		    ),
		    "impSaldo",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    798739,
			    null,
			    null,
			    null
			)
		    ),
		    "impCoste",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"PrintableString"
			    ),
			    new QName (
				"builtin",
				"PrintableString"
			    ),
			    798739,
			    new Intersection (
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new INTEGER(1),
					    new INTEGER(32),
					    0
					)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    null,
			    null
			)
		    ),
		    "codUsuario",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"PrintableString"
			    ),
			    new QName (
				"builtin",
				"PrintableString"
			    ),
			    798739,
			    new Intersection (
				new SizeConstraint (
				    new SingleValueConstraint (
					new INTEGER(1)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    null,
			    null
			)
		    ),
		    "codEstaPrep",
		    5,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"PrintableString"
			    ),
			    new QName (
				"builtin",
				"PrintableString"
			    ),
			    798739,
			    new Intersection (
				new SizeConstraint (
				    new SingleValueConstraint (
					new INTEGER(1)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    null,
			    null
			)
		    ),
		    "codSbEstaPrep",
		    6,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"PrintableString"
			    ),
			    new QName (
				"builtin",
				"PrintableString"
			    ),
			    798739,
			    new Intersection (
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new INTEGER(1),
					    new INTEGER(30),
					    0
					)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    null,
			    null
			)
		    ),
		    "codTipPrepa",
		    7,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"PrintableString"
			    ),
			    new QName (
				"builtin",
				"PrintableString"
			    ),
			    798739,
			    new Intersection (
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new INTEGER(1),
					    new INTEGER(4),
					    0
					)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    null,
			    null
			)
		    ),
		    "codTecnologia",
		    8,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x800a
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"PrintableString"
			    ),
			    new QName (
				"builtin",
				"PrintableString"
			    ),
			    798739,
			    new Intersection (
				new SizeConstraint (
				    new SingleValueConstraint (
					new INTEGER(2)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    null,
			    null
			)
		    ),
		    "codActuacion",
		    9,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800b
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    798739,
			    null,
			    null,
			    null
			)
		    ),
		    "codSbActuacion",
		    10,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x800c
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"PrintableString"
			    ),
			    new QName (
				"builtin",
				"PrintableString"
			    ),
			    798739,
			    new Intersection (
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new INTEGER(1),
					    new INTEGER(16),
					    0
					)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    null,
			    null
			)
		    ),
		    "fechaEjecucion",
		    11,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x800d
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    798739,
			    null
			)
		    ),
		    "flagActAnulacion",
		    12,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x800e
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"PrintableString"
			    ),
			    new QName (
				"builtin",
				"PrintableString"
			    ),
			    798739,
			    new Intersection (
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new INTEGER(1),
					    new INTEGER(20),
					    0
					)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    null,
			    null
			)
		    ),
		    "codRechazo",
		    13,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x800f
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"PrintableString"
			    ),
			    new QName (
				"builtin",
				"PrintableString"
			    ),
			    798739,
			    new Intersection (
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new INTEGER(1),
					    new INTEGER(16),
					    0
					)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    null,
			    null
			)
		    ),
		    "secuencia",
		    14,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8010
				}
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
			    new FieldsRef (
				new QName (
				    "notificacionexternas.ppif_interfazexterna",
				    "ParamsEspecificos"
				)
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
			)
		    ),
		    "paramsEspecificos",
		    15,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8011
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"PrintableString"
			    ),
			    new QName (
				"builtin",
				"PrintableString"
			    ),
			    798739,
			    new Intersection (
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new INTEGER(1),
					    new INTEGER(80),
					    0
					)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    null,
			    null
			)
		    ),
		    "desRechazo",
		    16,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8012
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"PrintableString"
			    ),
			    new QName (
				"builtin",
				"PrintableString"
			    ),
			    798739,
			    new Intersection (
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new INTEGER(1),
					    new INTEGER(3),
					    0
					)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    null,
			    null
			)
		    ),
		    "mediaType",
		    17,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8013
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"PrintableString"
			    ),
			    new QName (
				"builtin",
				"PrintableString"
			    ),
			    798739,
			    new Intersection (
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new INTEGER(1),
					    new INTEGER(36),
					    0
					)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    null,
			    null
			)
		    ),
		    "clientTransactionID",
		    18,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8014
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"PrintableString"
			    ),
			    new QName (
				"builtin",
				"PrintableString"
			    ),
			    798739,
			    new Intersection (
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new INTEGER(1),
					    new INTEGER(32),
					    0
					)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    null,
			    null
			)
		    ),
		    "erReference",
		    19,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8015
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"PrintableString"
			    ),
			    new QName (
				"builtin",
				"PrintableString"
			    ),
			    798739,
			    new Intersection (
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new INTEGER(1),
					    new INTEGER(2),
					    0
					)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    null,
			    null
			)
		    ),
		    "serviceProvider",
		    20,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8016
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"PrintableString"
			    ),
			    new QName (
				"builtin",
				"PrintableString"
			    ),
			    798739,
			    new Intersection (
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new INTEGER(1),
					    new INTEGER(16),
					    0
					)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    null,
			    null
			)
		    ),
		    "secuenciaAnul",
		    21,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8017
				}
			    ),
			    new QName (
				"notificacionexternas.ppif_interfazexterna",
				"INTEGER64"
			    ),
			    new QName (
				"PPIF-INTERFAZEXTERNA",
				"INTEGER64"
			    ),
			    798739,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(1),
					new INTEGER(8),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "impDeuda",
		    22,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8018
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"PrintableString"
			    ),
			    new QName (
				"builtin",
				"PrintableString"
			    ),
			    798739,
			    new Intersection (
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new INTEGER(1),
					    new INTEGER(16),
					    0
					)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    null,
			    null
			)
		    ),
		    "secuenciaProd",
		    23,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8019
				}
			    ),
			    new QName (
				"notificacionexternas.ppif_interfazexterna",
				"INTEGER64"
			    ),
			    new QName (
				"PPIF-INTERFAZEXTERNA",
				"INTEGER64"
			    ),
			    798739,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(1),
					new INTEGER(8),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "impCosteNeto",
		    24,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x801a
				}
			    ),
			    new QName (
				"notificacionexternas.ppif_interfazexterna",
				"INTEGER64"
			    ),
			    new QName (
				"PPIF-INTERFAZEXTERNA",
				"INTEGER64"
			    ),
			    798739,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(1),
					new INTEGER(8),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "impImpuesto",
		    25,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x801b
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    798739,
			    null
			)
		    ),
		    "flagDiscountApplied",
		    26,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x801c
				}
			    ),
			    new QName (
				"notificacionexternas.ppif_interfazexterna",
				"INTEGER64"
			    ),
			    new QName (
				"PPIF-INTERFAZEXTERNA",
				"INTEGER64"
			    ),
			    798739,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(1),
					new INTEGER(8),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "realCost",
		    27,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x801d
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    798739,
			    null,
			    null,
			    null
			)
		    ),
		    "discount",
		    28,
		    3,
		    null
		)
	    }
	),
	0,
	new TagDecoders (
	    new TagDecoder[] {
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 0)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 1),
			new TagDecoderElement((short)0x8003, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8009, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800a, 9)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800b, 10)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800c, 11)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800d, 12)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800e, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800f, 14)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8010, 15),
			new TagDecoderElement((short)0x8011, 16),
			new TagDecoderElement((short)0x8012, 17),
			new TagDecoderElement((short)0x8013, 18),
			new TagDecoderElement((short)0x8014, 19),
			new TagDecoderElement((short)0x8015, 20),
			new TagDecoderElement((short)0x8016, 21),
			new TagDecoderElement((short)0x8017, 22),
			new TagDecoderElement((short)0x8018, 23),
			new TagDecoderElement((short)0x8019, 24),
			new TagDecoderElement((short)0x801a, 25),
			new TagDecoderElement((short)0x801b, 26),
			new TagDecoderElement((short)0x801c, 27),
			new TagDecoderElement((short)0x801d, 28)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8011, 16),
			new TagDecoderElement((short)0x8012, 17),
			new TagDecoderElement((short)0x8013, 18),
			new TagDecoderElement((short)0x8014, 19),
			new TagDecoderElement((short)0x8015, 20),
			new TagDecoderElement((short)0x8016, 21),
			new TagDecoderElement((short)0x8017, 22),
			new TagDecoderElement((short)0x8018, 23),
			new TagDecoderElement((short)0x8019, 24),
			new TagDecoderElement((short)0x801a, 25),
			new TagDecoderElement((short)0x801b, 26),
			new TagDecoderElement((short)0x801c, 27),
			new TagDecoderElement((short)0x801d, 28)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8012, 17),
			new TagDecoderElement((short)0x8013, 18),
			new TagDecoderElement((short)0x8014, 19),
			new TagDecoderElement((short)0x8015, 20),
			new TagDecoderElement((short)0x8016, 21),
			new TagDecoderElement((short)0x8017, 22),
			new TagDecoderElement((short)0x8018, 23),
			new TagDecoderElement((short)0x8019, 24),
			new TagDecoderElement((short)0x801a, 25),
			new TagDecoderElement((short)0x801b, 26),
			new TagDecoderElement((short)0x801c, 27),
			new TagDecoderElement((short)0x801d, 28)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8013, 18),
			new TagDecoderElement((short)0x8014, 19),
			new TagDecoderElement((short)0x8015, 20),
			new TagDecoderElement((short)0x8016, 21),
			new TagDecoderElement((short)0x8017, 22),
			new TagDecoderElement((short)0x8018, 23),
			new TagDecoderElement((short)0x8019, 24),
			new TagDecoderElement((short)0x801a, 25),
			new TagDecoderElement((short)0x801b, 26),
			new TagDecoderElement((short)0x801c, 27),
			new TagDecoderElement((short)0x801d, 28)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8014, 19),
			new TagDecoderElement((short)0x8015, 20),
			new TagDecoderElement((short)0x8016, 21),
			new TagDecoderElement((short)0x8017, 22),
			new TagDecoderElement((short)0x8018, 23),
			new TagDecoderElement((short)0x8019, 24),
			new TagDecoderElement((short)0x801a, 25),
			new TagDecoderElement((short)0x801b, 26),
			new TagDecoderElement((short)0x801c, 27),
			new TagDecoderElement((short)0x801d, 28)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8015, 20),
			new TagDecoderElement((short)0x8016, 21),
			new TagDecoderElement((short)0x8017, 22),
			new TagDecoderElement((short)0x8018, 23),
			new TagDecoderElement((short)0x8019, 24),
			new TagDecoderElement((short)0x801a, 25),
			new TagDecoderElement((short)0x801b, 26),
			new TagDecoderElement((short)0x801c, 27),
			new TagDecoderElement((short)0x801d, 28)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8016, 21),
			new TagDecoderElement((short)0x8017, 22),
			new TagDecoderElement((short)0x8018, 23),
			new TagDecoderElement((short)0x8019, 24),
			new TagDecoderElement((short)0x801a, 25),
			new TagDecoderElement((short)0x801b, 26),
			new TagDecoderElement((short)0x801c, 27),
			new TagDecoderElement((short)0x801d, 28)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8017, 22),
			new TagDecoderElement((short)0x8018, 23),
			new TagDecoderElement((short)0x8019, 24),
			new TagDecoderElement((short)0x801a, 25),
			new TagDecoderElement((short)0x801b, 26),
			new TagDecoderElement((short)0x801c, 27),
			new TagDecoderElement((short)0x801d, 28)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8018, 23),
			new TagDecoderElement((short)0x8019, 24),
			new TagDecoderElement((short)0x801a, 25),
			new TagDecoderElement((short)0x801b, 26),
			new TagDecoderElement((short)0x801c, 27),
			new TagDecoderElement((short)0x801d, 28)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8019, 24),
			new TagDecoderElement((short)0x801a, 25),
			new TagDecoderElement((short)0x801b, 26),
			new TagDecoderElement((short)0x801c, 27),
			new TagDecoderElement((short)0x801d, 28)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x801a, 25),
			new TagDecoderElement((short)0x801b, 26),
			new TagDecoderElement((short)0x801c, 27),
			new TagDecoderElement((short)0x801d, 28)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x801b, 26),
			new TagDecoderElement((short)0x801c, 27),
			new TagDecoderElement((short)0x801d, 28)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x801c, 27),
			new TagDecoderElement((short)0x801d, 28)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x801d, 28)
		    }
		)
	    }
	),
	0
    );

    /**
     * Get the type descriptor (TypeInfo) of 'this' InterfazExterna object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }

    /**
     * Get the static type descriptor (TypeInfo) of 'this' InterfazExterna object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }

} // End class definition for InterfazExterna
