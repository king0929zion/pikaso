.class public abstract Landroidx/compose/ui/graphics/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(LP/l;FLW/H;ZI)LP/l;
    .locals 22

    move/from16 v0, p4

    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    move v8, v1

    goto :goto_0

    :cond_0
    move/from16 v8, p1

    :goto_0
    sget-wide v13, LW/K;->a:J

    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_1

    sget-object v1, LW/D;->a:LX1/e;

    move-object v15, v1

    goto :goto_1

    :cond_1
    move-object/from16 v15, p2

    :goto_1
    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    move/from16 v16, v0

    goto :goto_2

    :cond_2
    move/from16 v16, p3

    :goto_2
    sget-wide v19, LW/x;->a:J

    new-instance v0, Landroidx/compose/ui/graphics/GraphicsLayerElement;

    move-object v2, v0

    const/high16 v3, 0x3f800000    # 1.0f

    const/high16 v4, 0x3f800000    # 1.0f

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/high16 v12, 0x41000000    # 8.0f

    const/16 v21, 0x0

    move-wide/from16 v17, v19

    invoke-direct/range {v2 .. v21}, Landroidx/compose/ui/graphics/GraphicsLayerElement;-><init>(FFFFFFFFFFJLW/H;ZJJI)V

    move-object/from16 v1, p0

    invoke-interface {v1, v0}, LP/l;->c(LP/l;)LP/l;

    move-result-object v0

    return-object v0
.end method
