.class public interface abstract LY/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LG0/b;


# direct methods
.method public static S(JJ)J
    .locals 2

    invoke-static {p0, p1}, LV/f;->d(J)F

    move-result v0

    invoke-static {p2, p3}, LV/c;->b(J)F

    move-result v1

    sub-float/2addr v0, v1

    invoke-static {p0, p1}, LV/f;->b(J)F

    move-result p0

    invoke-static {p2, p3}, LV/c;->c(J)F

    move-result p1

    sub-float/2addr p0, p1

    invoke-static {v0, p0}, La/a;->d(FF)J

    move-result-wide p0

    return-wide p0
.end method

.method public static synthetic T(LY/d;LW/C;LW/D;FLY/g;I)V
    .locals 7

    and-int/lit8 v0, p5, 0x4

    if-eqz v0, :cond_0

    const/high16 p3, 0x3f800000    # 1.0f

    :cond_0
    move v3, p3

    and-int/lit8 p3, p5, 0x8

    if-eqz p3, :cond_1

    sget-object p4, LY/f;->b:LY/f;

    :cond_1
    move-object v4, p4

    and-int/lit8 p3, p5, 0x20

    if-eqz p3, :cond_2

    const/4 p3, 0x3

    :goto_0
    move v6, p3

    goto :goto_1

    :cond_2
    const/4 p3, 0x0

    goto :goto_0

    :goto_1
    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-interface/range {v0 .. v6}, LY/d;->m(LW/C;LW/D;FLY/c;LW/l;I)V

    return-void
.end method

.method public static e(LY/d;LW/f;JJJFLW/l;II)V
    .locals 18

    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_0

    const-wide/16 v1, 0x0

    move-wide v5, v1

    goto :goto_0

    :cond_0
    move-wide/from16 v5, p2

    :goto_0
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_1

    move-wide/from16 v11, p4

    goto :goto_1

    :cond_1
    move-wide/from16 v11, p6

    :goto_1
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_2

    const/high16 v1, 0x3f800000    # 1.0f

    move v13, v1

    goto :goto_2

    :cond_2
    move/from16 v13, p8

    :goto_2
    sget-object v14, LY/f;->b:LY/f;

    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    move/from16 v17, v0

    goto :goto_3

    :cond_3
    move/from16 v17, p10

    :goto_3
    const-wide/16 v9, 0x0

    const/16 v16, 0x3

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-wide/from16 v7, p4

    move-object/from16 v15, p9

    invoke-interface/range {v3 .. v17}, LY/d;->E(LW/f;JJJJFLY/c;LW/l;II)V

    return-void
.end method

.method public static i(Ln0/B;JFJI)V
    .locals 7

    and-int/lit8 p6, p6, 0x4

    if-eqz p6, :cond_0

    iget-object p4, p0, Ln0/B;->d:LY/b;

    invoke-interface {p4}, LY/d;->k()J

    move-result-wide p4

    :cond_0
    sget-object v3, LY/f;->b:LY/f;

    iget-object v0, p0, Ln0/B;->d:LY/b;

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v5, 0x0

    const/4 v6, 0x3

    iget-object p0, v0, LY/b;->d:LY/a;

    iget-object p0, p0, LY/a;->c:LW/o;

    move-wide v1, p1

    invoke-static/range {v0 .. v6}, LY/b;->a(LY/b;JLY/c;FLW/l;I)LW/g;

    move-result-object p1

    invoke-interface {p0, p3, p4, p5, p1}, LW/o;->i(FJLW/g;)V

    return-void
.end method

.method public static synthetic r(LY/d;JJI)V
    .locals 12

    and-int/lit8 v0, p5, 0x4

    const-wide/16 v4, 0x0

    if-eqz v0, :cond_0

    invoke-interface {p0}, LY/d;->L()J

    move-result-wide v0

    invoke-static {v0, v1, v4, v5}, LY/d;->S(JJ)J

    move-result-wide v0

    move-wide v6, v0

    goto :goto_0

    :cond_0
    move-wide v6, p3

    :goto_0
    sget-object v9, LY/f;->b:LY/f;

    and-int/lit8 v0, p5, 0x40

    if-eqz v0, :cond_1

    const/4 v0, 0x3

    :goto_1
    move v11, v0

    goto :goto_2

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :goto_2
    const/high16 v8, 0x3f800000    # 1.0f

    const/4 v10, 0x0

    move-object v1, p0

    move-wide v2, p1

    invoke-interface/range {v1 .. v11}, LY/d;->x(JJJFLY/c;LW/l;I)V

    return-void
.end method


# virtual methods
.method public abstract E(LW/f;JJJJFLY/c;LW/l;II)V
.end method

.method public abstract H()LB0/a;
.end method

.method public L()J
    .locals 2

    invoke-interface {p0}, LY/d;->H()LB0/a;

    move-result-object v0

    invoke-virtual {v0}, LB0/a;->r()J

    move-result-wide v0

    return-wide v0
.end method

.method public abstract getLayoutDirection()LG0/f;
.end method

.method public k()J
    .locals 2

    invoke-interface {p0}, LY/d;->H()LB0/a;

    move-result-object v0

    invoke-virtual {v0}, LB0/a;->r()J

    move-result-wide v0

    invoke-static {v0, v1}, La/a;->D(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public abstract m(LW/C;LW/D;FLY/c;LW/l;I)V
.end method

.method public abstract x(JJJFLY/c;LW/l;I)V
.end method
