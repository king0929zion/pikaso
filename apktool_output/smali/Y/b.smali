.class public final LY/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY/d;


# instance fields
.field public final d:LY/a;

.field public final e:LB0/a;

.field public f:LW/g;

.field public g:LW/g;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LY/a;

    sget-object v1, LY/c;->a:LG0/c;

    sget-object v2, LG0/f;->d:LG0/f;

    new-instance v3, LY/e;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, LY/a;->a:LG0/b;

    iput-object v2, v0, LY/a;->b:LG0/f;

    iput-object v3, v0, LY/a;->c:LW/o;

    const-wide/16 v1, 0x0

    iput-wide v1, v0, LY/a;->d:J

    iput-object v0, p0, LY/b;->d:LY/a;

    new-instance v0, LB0/a;

    invoke-direct {v0, p0}, LB0/a;-><init>(LY/b;)V

    iput-object v0, p0, LY/b;->e:LB0/a;

    return-void
.end method

.method public static a(LY/b;JLY/c;FLW/l;I)LW/g;
    .locals 0

    invoke-virtual {p0, p3}, LY/b;->d(LY/c;)LW/g;

    move-result-object p0

    const/high16 p3, 0x3f800000    # 1.0f

    cmpg-float p3, p4, p3

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, LW/r;->d(J)F

    move-result p3

    mul-float/2addr p3, p4

    invoke-static {p1, p2, p3}, LW/r;->b(JF)J

    move-result-wide p1

    :goto_0
    iget-object p3, p0, LW/g;->a:Landroid/graphics/Paint;

    invoke-virtual {p3}, Landroid/graphics/Paint;->getColor()I

    move-result p3

    invoke-static {p3}, LW/D;->b(I)J

    move-result-wide p3

    invoke-static {p3, p4, p1, p2}, LW/r;->c(JJ)Z

    move-result p3

    if-nez p3, :cond_1

    invoke-virtual {p0, p1, p2}, LW/g;->c(J)V

    :cond_1
    iget-object p1, p0, LW/g;->c:Landroid/graphics/Shader;

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    iput-object p1, p0, LW/g;->c:Landroid/graphics/Shader;

    iget-object p2, p0, LW/g;->a:Landroid/graphics/Paint;

    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    :cond_2
    iget-object p1, p0, LW/g;->d:LW/l;

    invoke-static {p1, p5}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {p0, p5}, LW/g;->d(LW/l;)V

    :cond_3
    iget p1, p0, LW/g;->b:I

    invoke-static {p1, p6}, LW/D;->l(II)Z

    move-result p1

    if-nez p1, :cond_4

    invoke-virtual {p0, p6}, LW/g;->b(I)V

    :cond_4
    iget-object p1, p0, LW/g;->a:Landroid/graphics/Paint;

    invoke-virtual {p1}, Landroid/graphics/Paint;->isFilterBitmap()Z

    move-result p1

    const/4 p2, 0x1

    invoke-static {p1, p2}, LW/D;->n(II)Z

    move-result p1

    if-nez p1, :cond_5

    const/4 p1, 0x0

    invoke-static {p2, p1}, LW/D;->n(II)Z

    move-result p1

    xor-int/2addr p1, p2

    iget-object p2, p0, LW/g;->a:Landroid/graphics/Paint;

    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    :cond_5
    return-object p0
.end method


# virtual methods
.method public final E(LW/f;JJJJFLY/c;LW/l;II)V
    .locals 19

    move-object/from16 v7, p0

    iget-object v0, v7, LY/b;->d:LY/a;

    iget-object v8, v0, LY/a;->c:LW/o;

    const/4 v1, 0x0

    move-object/from16 v0, p0

    move-object/from16 v2, p11

    move/from16 v3, p10

    move-object/from16 v4, p12

    move/from16 v5, p13

    move/from16 v6, p14

    invoke-virtual/range {v0 .. v6}, LY/b;->c(LW/D;LY/c;FLW/l;II)LW/g;

    move-result-object v18

    move-object/from16 v9, p1

    move-wide/from16 v10, p2

    move-wide/from16 v12, p4

    move-wide/from16 v14, p6

    move-wide/from16 v16, p8

    invoke-interface/range {v8 .. v18}, LW/o;->l(LW/f;JJJJLW/g;)V

    return-void
.end method

.method public final H()LB0/a;
    .locals 1

    iget-object v0, p0, LY/b;->e:LB0/a;

    return-object v0
.end method

.method public final c(LW/D;LY/c;FLW/l;II)LW/g;
    .locals 4

    invoke-virtual {p0, p2}, LY/b;->d(LY/c;)LW/g;

    move-result-object p2

    if-eqz p1, :cond_0

    invoke-interface {p0}, LY/d;->L()J

    move-result-wide v0

    invoke-virtual {p1, p3, v0, v1, p2}, LW/D;->h(FJLW/g;)V

    goto :goto_0

    :cond_0
    iget-object p1, p2, LW/g;->c:Landroid/graphics/Shader;

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p2, LW/g;->c:Landroid/graphics/Shader;

    iget-object v0, p2, LW/g;->a:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    :cond_1
    iget-object p1, p2, LW/g;->a:Landroid/graphics/Paint;

    invoke-virtual {p1}, Landroid/graphics/Paint;->getColor()I

    move-result p1

    invoke-static {p1}, LW/D;->b(I)J

    move-result-wide v0

    sget-wide v2, LW/r;->b:J

    invoke-static {v0, v1, v2, v3}, LW/r;->c(JJ)Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {p2, v2, v3}, LW/g;->c(J)V

    :cond_2
    iget-object p1, p2, LW/g;->a:Landroid/graphics/Paint;

    invoke-virtual {p1}, Landroid/graphics/Paint;->getAlpha()I

    move-result p1

    int-to-float p1, p1

    const/high16 v0, 0x437f0000    # 255.0f

    div-float/2addr p1, v0

    cmpg-float p1, p1, p3

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {p2, p3}, LW/g;->a(F)V

    :goto_0
    iget-object p1, p2, LW/g;->d:LW/l;

    invoke-static {p1, p4}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    invoke-virtual {p2, p4}, LW/g;->d(LW/l;)V

    :cond_4
    iget p1, p2, LW/g;->b:I

    invoke-static {p1, p5}, LW/D;->l(II)Z

    move-result p1

    if-nez p1, :cond_5

    invoke-virtual {p2, p5}, LW/g;->b(I)V

    :cond_5
    iget-object p1, p2, LW/g;->a:Landroid/graphics/Paint;

    invoke-virtual {p1}, Landroid/graphics/Paint;->isFilterBitmap()Z

    move-result p1

    invoke-static {p1, p6}, LW/D;->n(II)Z

    move-result p1

    if-nez p1, :cond_6

    const/4 p1, 0x0

    invoke-static {p6, p1}, LW/D;->n(II)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    iget-object p3, p2, LW/g;->a:Landroid/graphics/Paint;

    invoke-virtual {p3, p1}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    :cond_6
    return-object p2
.end method

.method public final d(LY/c;)LW/g;
    .locals 9

    sget-object v0, LY/f;->b:LY/f;

    invoke-static {p1, v0}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object p1, p0, LY/b;->f:LW/g;

    if-nez p1, :cond_f

    invoke-static {}, LW/D;->e()LW/g;

    move-result-object p1

    invoke-virtual {p1, v1}, LW/g;->g(I)V

    iput-object p1, p0, LY/b;->f:LW/g;

    goto/16 :goto_6

    :cond_0
    instance-of v0, p1, LY/g;

    if-eqz v0, :cond_10

    iget-object v0, p0, LY/b;->g:LW/g;

    const/4 v2, 0x1

    if-nez v0, :cond_1

    invoke-static {}, LW/D;->e()LW/g;

    move-result-object v0

    invoke-virtual {v0, v2}, LW/g;->g(I)V

    iput-object v0, p0, LY/b;->g:LW/g;

    :cond_1
    iget-object v3, v0, LW/g;->a:Landroid/graphics/Paint;

    invoke-virtual {v3}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v4

    check-cast p1, LY/g;

    iget v5, p1, LY/g;->b:F

    cmpg-float v4, v4, v5

    if-nez v4, :cond_2

    goto :goto_0

    :cond_2
    iget-object v4, v0, LW/g;->a:Landroid/graphics/Paint;

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    :goto_0
    invoke-virtual {v3}, Landroid/graphics/Paint;->getStrokeCap()Landroid/graphics/Paint$Cap;

    move-result-object v4

    const/4 v5, -0x1

    if-nez v4, :cond_3

    move v4, v5

    goto :goto_1

    :cond_3
    sget-object v6, LW/h;->a:[I

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v4, v6, v4

    :goto_1
    const/4 v6, 0x3

    const/4 v7, 0x2

    if-eq v4, v2, :cond_4

    if-eq v4, v7, :cond_6

    if-eq v4, v6, :cond_5

    :cond_4
    move v4, v1

    goto :goto_2

    :cond_5
    move v4, v7

    goto :goto_2

    :cond_6
    move v4, v2

    :goto_2
    iget v8, p1, LY/g;->d:I

    invoke-static {v4, v8}, LW/D;->p(II)Z

    move-result v4

    if-nez v4, :cond_7

    invoke-virtual {v0, v8}, LW/g;->e(I)V

    :cond_7
    invoke-virtual {v3}, Landroid/graphics/Paint;->getStrokeMiter()F

    move-result v4

    iget v8, p1, LY/g;->c:F

    cmpg-float v4, v4, v8

    if-nez v4, :cond_8

    goto :goto_3

    :cond_8
    iget-object v4, v0, LW/g;->a:Landroid/graphics/Paint;

    invoke-virtual {v4, v8}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    :goto_3
    invoke-virtual {v3}, Landroid/graphics/Paint;->getStrokeJoin()Landroid/graphics/Paint$Join;

    move-result-object v3

    if-nez v3, :cond_9

    goto :goto_4

    :cond_9
    sget-object v4, LW/h;->b:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v5, v4, v3

    :goto_4
    if-eq v5, v2, :cond_c

    if-eq v5, v7, :cond_b

    if-eq v5, v6, :cond_a

    goto :goto_5

    :cond_a
    move v1, v2

    goto :goto_5

    :cond_b
    move v1, v7

    :cond_c
    :goto_5
    iget p1, p1, LY/g;->e:I

    invoke-static {v1, p1}, LW/D;->q(II)Z

    move-result v1

    if-nez v1, :cond_d

    invoke-virtual {v0, p1}, LW/g;->f(I)V

    :cond_d
    const/4 p1, 0x0

    invoke-static {p1, p1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    iget-object v1, v0, LW/g;->a:Landroid/graphics/Paint;

    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    :cond_e
    move-object p1, v0

    :cond_f
    :goto_6
    return-object p1

    :cond_10
    new-instance p1, LB1/c;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
.end method

.method public final f()F
    .locals 1

    iget-object v0, p0, LY/b;->d:LY/a;

    iget-object v0, v0, LY/a;->a:LG0/b;

    invoke-interface {v0}, LG0/b;->f()F

    move-result v0

    return v0
.end method

.method public final getLayoutDirection()LG0/f;
    .locals 1

    iget-object v0, p0, LY/b;->d:LY/a;

    iget-object v0, v0, LY/a;->b:LG0/f;

    return-object v0
.end method

.method public final m(LW/C;LW/D;FLY/c;LW/l;I)V
    .locals 8

    iget-object v0, p0, LY/b;->d:LY/a;

    iget-object v0, v0, LY/a;->c:LW/o;

    const/4 v7, 0x1

    move-object v1, p0

    move-object v2, p2

    move-object v3, p4

    move v4, p3

    move-object v5, p5

    move v6, p6

    invoke-virtual/range {v1 .. v7}, LY/b;->c(LW/D;LY/c;FLW/l;II)LW/g;

    move-result-object p2

    invoke-interface {v0, p1, p2}, LW/o;->h(LW/C;LW/g;)V

    return-void
.end method

.method public final n()F
    .locals 1

    iget-object v0, p0, LY/b;->d:LY/a;

    iget-object v0, v0, LY/a;->a:LG0/b;

    invoke-interface {v0}, LG0/b;->n()F

    move-result v0

    return v0
.end method

.method public final x(JJJFLY/c;LW/l;I)V
    .locals 13

    move-object v7, p0

    iget-object v0, v7, LY/b;->d:LY/a;

    iget-object v8, v0, LY/a;->c:LW/o;

    invoke-static/range {p3 .. p4}, LV/c;->b(J)F

    move-result v9

    invoke-static/range {p3 .. p4}, LV/c;->c(J)F

    move-result v10

    invoke-static/range {p3 .. p4}, LV/c;->b(J)F

    move-result v0

    invoke-static/range {p5 .. p6}, LV/f;->d(J)F

    move-result v1

    add-float v11, v1, v0

    invoke-static/range {p3 .. p4}, LV/c;->c(J)F

    move-result v0

    invoke-static/range {p5 .. p6}, LV/f;->b(J)F

    move-result v1

    add-float v12, v1, v0

    move-object v0, p0

    move-wide v1, p1

    move-object/from16 v3, p8

    move/from16 v4, p7

    move-object/from16 v5, p9

    move/from16 v6, p10

    invoke-static/range {v0 .. v6}, LY/b;->a(LY/b;JLY/c;FLW/l;I)LW/g;

    move-result-object v0

    move-object p1, v8

    move p2, v9

    move/from16 p3, v10

    move/from16 p4, v11

    move/from16 p5, v12

    move-object/from16 p6, v0

    invoke-interface/range {p1 .. p6}, LW/o;->p(FFFFLW/g;)V

    return-void
.end method
