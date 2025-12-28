.class public abstract LW/u;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LX/c;)Landroid/graphics/ColorSpace;
    .locals 23

    move-object/from16 v0, p0

    sget-object v1, LX/e;->c:LX/r;

    invoke-static {v0, v1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v0, Landroid/graphics/ColorSpace$Named;->SRGB:Landroid/graphics/ColorSpace$Named;

    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    goto/16 :goto_2

    :cond_0
    sget-object v1, LX/e;->o:LX/r;

    invoke-static {v0, v1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v0, Landroid/graphics/ColorSpace$Named;->ACES:Landroid/graphics/ColorSpace$Named;

    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    goto/16 :goto_2

    :cond_1
    sget-object v1, LX/e;->p:LX/r;

    invoke-static {v0, v1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v0, Landroid/graphics/ColorSpace$Named;->ACESCG:Landroid/graphics/ColorSpace$Named;

    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    goto/16 :goto_2

    :cond_2
    sget-object v1, LX/e;->m:LX/r;

    invoke-static {v0, v1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object v0, Landroid/graphics/ColorSpace$Named;->ADOBE_RGB:Landroid/graphics/ColorSpace$Named;

    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    goto/16 :goto_2

    :cond_3
    sget-object v1, LX/e;->h:LX/r;

    invoke-static {v0, v1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    sget-object v0, Landroid/graphics/ColorSpace$Named;->BT2020:Landroid/graphics/ColorSpace$Named;

    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    goto/16 :goto_2

    :cond_4
    sget-object v1, LX/e;->g:LX/r;

    invoke-static {v0, v1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    sget-object v0, Landroid/graphics/ColorSpace$Named;->BT709:Landroid/graphics/ColorSpace$Named;

    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    goto/16 :goto_2

    :cond_5
    sget-object v1, LX/e;->r:LX/l;

    invoke-static {v0, v1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    sget-object v0, Landroid/graphics/ColorSpace$Named;->CIE_LAB:Landroid/graphics/ColorSpace$Named;

    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    goto/16 :goto_2

    :cond_6
    sget-object v1, LX/e;->q:LX/l;

    invoke-static {v0, v1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    sget-object v0, Landroid/graphics/ColorSpace$Named;->CIE_XYZ:Landroid/graphics/ColorSpace$Named;

    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    goto/16 :goto_2

    :cond_7
    sget-object v1, LX/e;->i:LX/r;

    invoke-static {v0, v1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    sget-object v0, Landroid/graphics/ColorSpace$Named;->DCI_P3:Landroid/graphics/ColorSpace$Named;

    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    goto/16 :goto_2

    :cond_8
    sget-object v1, LX/e;->j:LX/r;

    invoke-static {v0, v1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    sget-object v0, Landroid/graphics/ColorSpace$Named;->DISPLAY_P3:Landroid/graphics/ColorSpace$Named;

    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    goto/16 :goto_2

    :cond_9
    sget-object v1, LX/e;->e:LX/r;

    invoke-static {v0, v1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    sget-object v0, Landroid/graphics/ColorSpace$Named;->EXTENDED_SRGB:Landroid/graphics/ColorSpace$Named;

    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    goto/16 :goto_2

    :cond_a
    sget-object v1, LX/e;->f:LX/r;

    invoke-static {v0, v1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    sget-object v0, Landroid/graphics/ColorSpace$Named;->LINEAR_EXTENDED_SRGB:Landroid/graphics/ColorSpace$Named;

    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    goto/16 :goto_2

    :cond_b
    sget-object v1, LX/e;->d:LX/r;

    invoke-static {v0, v1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    sget-object v0, Landroid/graphics/ColorSpace$Named;->LINEAR_SRGB:Landroid/graphics/ColorSpace$Named;

    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    goto/16 :goto_2

    :cond_c
    sget-object v1, LX/e;->k:LX/r;

    invoke-static {v0, v1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    sget-object v0, Landroid/graphics/ColorSpace$Named;->NTSC_1953:Landroid/graphics/ColorSpace$Named;

    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    goto/16 :goto_2

    :cond_d
    sget-object v1, LX/e;->n:LX/r;

    invoke-static {v0, v1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    sget-object v0, Landroid/graphics/ColorSpace$Named;->PRO_PHOTO_RGB:Landroid/graphics/ColorSpace$Named;

    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    goto/16 :goto_2

    :cond_e
    sget-object v1, LX/e;->l:LX/r;

    invoke-static {v0, v1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    sget-object v0, Landroid/graphics/ColorSpace$Named;->SMPTE_C:Landroid/graphics/ColorSpace$Named;

    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    goto/16 :goto_2

    :cond_f
    instance-of v1, v0, LX/r;

    if-eqz v1, :cond_12

    move-object v1, v0

    check-cast v1, LX/r;

    iget-object v2, v1, LX/r;->d:LX/t;

    invoke-virtual {v2}, LX/t;->a()[F

    move-result-object v6

    iget-object v2, v1, LX/r;->g:LX/s;

    if-eqz v2, :cond_10

    new-instance v3, Landroid/graphics/ColorSpace$Rgb$TransferParameters;

    iget-wide v4, v2, LX/s;->g:D

    iget-wide v14, v2, LX/s;->a:D

    iget-wide v8, v2, LX/s;->b:D

    iget-wide v10, v2, LX/s;->c:D

    iget-wide v12, v2, LX/s;->d:D

    move-wide/from16 v16, v14

    iget-wide v14, v2, LX/s;->e:D

    move-object/from16 v22, v1

    iget-wide v1, v2, LX/s;->f:D

    move-object v7, v3

    move-wide/from16 v20, v16

    move-wide/from16 v16, v1

    move-wide/from16 v18, v4

    invoke-direct/range {v7 .. v21}, Landroid/graphics/ColorSpace$Rgb$TransferParameters;-><init>(DDDDDDD)V

    goto :goto_0

    :cond_10
    move-object/from16 v22, v1

    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_11

    new-instance v1, Landroid/graphics/ColorSpace$Rgb;

    iget-object v0, v0, LX/c;->a:Ljava/lang/String;

    move-object/from16 v2, v22

    iget-object v2, v2, LX/r;->h:[F

    invoke-direct {v1, v0, v2, v6, v3}, Landroid/graphics/ColorSpace$Rgb;-><init>(Ljava/lang/String;[F[FLandroid/graphics/ColorSpace$Rgb$TransferParameters;)V

    :goto_1
    move-object v0, v1

    goto :goto_2

    :cond_11
    move-object/from16 v2, v22

    new-instance v1, Landroid/graphics/ColorSpace$Rgb;

    iget-object v4, v0, LX/c;->a:Ljava/lang/String;

    iget-object v3, v2, LX/r;->l:LX/q;

    new-instance v7, LW/s;

    const/4 v5, 0x0

    invoke-direct {v7, v3, v5}, LW/s;-><init>(Lp2/h;I)V

    new-instance v8, LW/s;

    iget-object v3, v2, LX/r;->o:LX/q;

    const/4 v5, 0x1

    invoke-direct {v8, v3, v5}, LW/s;-><init>(Lp2/h;I)V

    check-cast v0, LX/r;

    iget v9, v0, LX/r;->e:F

    iget v10, v0, LX/r;->f:F

    iget-object v5, v2, LX/r;->h:[F

    move-object v3, v1

    invoke-direct/range {v3 .. v10}, Landroid/graphics/ColorSpace$Rgb;-><init>(Ljava/lang/String;[F[FLjava/util/function/DoubleUnaryOperator;Ljava/util/function/DoubleUnaryOperator;FF)V

    goto :goto_1

    :cond_12
    sget-object v0, Landroid/graphics/ColorSpace$Named;->SRGB:Landroid/graphics/ColorSpace$Named;

    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    :goto_2
    return-object v0
.end method

.method public static final b(Landroid/graphics/ColorSpace;)LX/c;
    .locals 27

    move-object/from16 v0, p0

    invoke-virtual/range {p0 .. p0}, Landroid/graphics/ColorSpace;->getId()I

    move-result v1

    sget-object v2, Landroid/graphics/ColorSpace$Named;->SRGB:Landroid/graphics/ColorSpace$Named;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-ne v1, v2, :cond_0

    sget-object v0, LX/e;->c:LX/r;

    goto/16 :goto_3

    :cond_0
    sget-object v2, Landroid/graphics/ColorSpace$Named;->ACES:Landroid/graphics/ColorSpace$Named;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-ne v1, v2, :cond_1

    sget-object v0, LX/e;->o:LX/r;

    goto/16 :goto_3

    :cond_1
    sget-object v2, Landroid/graphics/ColorSpace$Named;->ACESCG:Landroid/graphics/ColorSpace$Named;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-ne v1, v2, :cond_2

    sget-object v0, LX/e;->p:LX/r;

    goto/16 :goto_3

    :cond_2
    sget-object v2, Landroid/graphics/ColorSpace$Named;->ADOBE_RGB:Landroid/graphics/ColorSpace$Named;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-ne v1, v2, :cond_3

    sget-object v0, LX/e;->m:LX/r;

    goto/16 :goto_3

    :cond_3
    sget-object v2, Landroid/graphics/ColorSpace$Named;->BT2020:Landroid/graphics/ColorSpace$Named;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-ne v1, v2, :cond_4

    sget-object v0, LX/e;->h:LX/r;

    goto/16 :goto_3

    :cond_4
    sget-object v2, Landroid/graphics/ColorSpace$Named;->BT709:Landroid/graphics/ColorSpace$Named;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-ne v1, v2, :cond_5

    sget-object v0, LX/e;->g:LX/r;

    goto/16 :goto_3

    :cond_5
    sget-object v2, Landroid/graphics/ColorSpace$Named;->CIE_LAB:Landroid/graphics/ColorSpace$Named;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-ne v1, v2, :cond_6

    sget-object v0, LX/e;->r:LX/l;

    goto/16 :goto_3

    :cond_6
    sget-object v2, Landroid/graphics/ColorSpace$Named;->CIE_XYZ:Landroid/graphics/ColorSpace$Named;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-ne v1, v2, :cond_7

    sget-object v0, LX/e;->q:LX/l;

    goto/16 :goto_3

    :cond_7
    sget-object v2, Landroid/graphics/ColorSpace$Named;->DCI_P3:Landroid/graphics/ColorSpace$Named;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-ne v1, v2, :cond_8

    sget-object v0, LX/e;->i:LX/r;

    goto/16 :goto_3

    :cond_8
    sget-object v2, Landroid/graphics/ColorSpace$Named;->DISPLAY_P3:Landroid/graphics/ColorSpace$Named;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-ne v1, v2, :cond_9

    sget-object v0, LX/e;->j:LX/r;

    goto/16 :goto_3

    :cond_9
    sget-object v2, Landroid/graphics/ColorSpace$Named;->EXTENDED_SRGB:Landroid/graphics/ColorSpace$Named;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-ne v1, v2, :cond_a

    sget-object v0, LX/e;->e:LX/r;

    goto/16 :goto_3

    :cond_a
    sget-object v2, Landroid/graphics/ColorSpace$Named;->LINEAR_EXTENDED_SRGB:Landroid/graphics/ColorSpace$Named;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-ne v1, v2, :cond_b

    sget-object v0, LX/e;->f:LX/r;

    goto/16 :goto_3

    :cond_b
    sget-object v2, Landroid/graphics/ColorSpace$Named;->LINEAR_SRGB:Landroid/graphics/ColorSpace$Named;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-ne v1, v2, :cond_c

    sget-object v0, LX/e;->d:LX/r;

    goto/16 :goto_3

    :cond_c
    sget-object v2, Landroid/graphics/ColorSpace$Named;->NTSC_1953:Landroid/graphics/ColorSpace$Named;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-ne v1, v2, :cond_d

    sget-object v0, LX/e;->k:LX/r;

    goto/16 :goto_3

    :cond_d
    sget-object v2, Landroid/graphics/ColorSpace$Named;->PRO_PHOTO_RGB:Landroid/graphics/ColorSpace$Named;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-ne v1, v2, :cond_e

    sget-object v0, LX/e;->n:LX/r;

    goto/16 :goto_3

    :cond_e
    sget-object v2, Landroid/graphics/ColorSpace$Named;->SMPTE_C:Landroid/graphics/ColorSpace$Named;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-ne v1, v2, :cond_f

    sget-object v0, LX/e;->l:LX/r;

    goto/16 :goto_3

    :cond_f
    instance-of v1, v0, Landroid/graphics/ColorSpace$Rgb;

    if-eqz v1, :cond_12

    move-object v1, v0

    check-cast v1, Landroid/graphics/ColorSpace$Rgb;

    invoke-virtual {v1}, Landroid/graphics/ColorSpace$Rgb;->getTransferParameters()Landroid/graphics/ColorSpace$Rgb$TransferParameters;

    move-result-object v2

    invoke-virtual {v1}, Landroid/graphics/ColorSpace$Rgb;->getWhitePoint()[F

    move-result-object v3

    array-length v3, v3

    const/4 v4, 0x3

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-ne v3, v4, :cond_10

    new-instance v3, LX/t;

    invoke-virtual {v1}, Landroid/graphics/ColorSpace$Rgb;->getWhitePoint()[F

    move-result-object v4

    aget v4, v4, v6

    invoke-virtual {v1}, Landroid/graphics/ColorSpace$Rgb;->getWhitePoint()[F

    move-result-object v7

    aget v5, v7, v5

    invoke-virtual {v1}, Landroid/graphics/ColorSpace$Rgb;->getWhitePoint()[F

    move-result-object v7

    const/4 v8, 0x2

    aget v7, v7, v8

    add-float v8, v4, v5

    add-float/2addr v8, v7

    div-float/2addr v4, v8

    div-float/2addr v5, v8

    invoke-direct {v3, v4, v5}, LX/t;-><init>(FF)V

    :goto_0
    move-object v10, v3

    goto :goto_1

    :cond_10
    new-instance v3, LX/t;

    invoke-virtual {v1}, Landroid/graphics/ColorSpace$Rgb;->getWhitePoint()[F

    move-result-object v4

    aget v4, v4, v6

    invoke-virtual {v1}, Landroid/graphics/ColorSpace$Rgb;->getWhitePoint()[F

    move-result-object v7

    aget v5, v7, v5

    invoke-direct {v3, v4, v5}, LX/t;-><init>(FF)V

    goto :goto_0

    :goto_1
    if-eqz v2, :cond_11

    new-instance v3, LX/s;

    iget-wide v12, v2, Landroid/graphics/ColorSpace$Rgb$TransferParameters;->g:D

    iget-wide v14, v2, Landroid/graphics/ColorSpace$Rgb$TransferParameters;->a:D

    iget-wide v4, v2, Landroid/graphics/ColorSpace$Rgb$TransferParameters;->b:D

    iget-wide v7, v2, Landroid/graphics/ColorSpace$Rgb$TransferParameters;->c:D

    move-wide/from16 v18, v7

    iget-wide v6, v2, Landroid/graphics/ColorSpace$Rgb$TransferParameters;->d:D

    move-object/from16 v26, v10

    iget-wide v9, v2, Landroid/graphics/ColorSpace$Rgb$TransferParameters;->e:D

    move-wide/from16 v22, v9

    iget-wide v8, v2, Landroid/graphics/ColorSpace$Rgb$TransferParameters;->f:D

    move-object v11, v3

    move-wide/from16 v16, v4

    move-wide/from16 v20, v6

    move-wide/from16 v24, v8

    invoke-direct/range {v11 .. v25}, LX/s;-><init>(DDDDDDD)V

    move-object/from16 v16, v3

    goto :goto_2

    :cond_11
    move-object/from16 v26, v10

    const/4 v2, 0x0

    move-object/from16 v16, v2

    :goto_2
    new-instance v2, LX/r;

    invoke-virtual {v1}, Landroid/graphics/ColorSpace;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Landroid/graphics/ColorSpace$Rgb;->getPrimaries()[F

    move-result-object v9

    invoke-virtual {v1}, Landroid/graphics/ColorSpace$Rgb;->getTransform()[F

    move-result-object v11

    new-instance v12, LW/t;

    const/4 v3, 0x0

    invoke-direct {v12, v0, v3}, LW/t;-><init>(Landroid/graphics/ColorSpace;I)V

    new-instance v13, LW/t;

    const/4 v3, 0x1

    invoke-direct {v13, v0, v3}, LW/t;-><init>(Landroid/graphics/ColorSpace;I)V

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroid/graphics/ColorSpace;->getMinValue(I)F

    move-result v14

    invoke-virtual {v0, v3}, Landroid/graphics/ColorSpace;->getMaxValue(I)F

    move-result v15

    invoke-virtual {v1}, Landroid/graphics/ColorSpace;->getId()I

    move-result v17

    move-object v7, v2

    move-object/from16 v10, v26

    invoke-direct/range {v7 .. v17}, LX/r;-><init>(Ljava/lang/String;[FLX/t;[FLX/j;LX/j;FFLX/s;I)V

    move-object v0, v2

    goto :goto_3

    :cond_12
    sget-object v0, LX/e;->c:LX/r;

    :goto_3
    return-object v0
.end method
