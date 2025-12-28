.class public abstract LA/L;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LD/H;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, LA/p;->o:LA/p;

    sget-object v1, LD/U;->i:LD/U;

    new-instance v2, LD/H;

    invoke-direct {v2, v1, v0}, LD/H;-><init>(LD/H0;Lo2/a;)V

    sput-object v2, LA/L;->a:LD/H;

    return-void
.end method

.method public static final a(LP/l;LW/H;JF)LP/l;
    .locals 4

    const/4 v0, 0x0

    cmpl-float v1, p4, v0

    sget-object v2, LP/i;->a:LP/i;

    if-lez v1, :cond_0

    const/4 v1, 0x0

    const v3, 0x1e7df

    invoke-static {v2, p4, p1, v1, v3}, Landroidx/compose/ui/graphics/a;->a(LP/l;FLW/H;ZI)LP/l;

    move-result-object p4

    goto :goto_0

    :cond_0
    move-object p4, v2

    :goto_0
    invoke-interface {p0, p4}, LP/l;->c(LP/l;)LP/l;

    move-result-object p0

    invoke-interface {p0, v2}, LP/l;->c(LP/l;)LP/l;

    move-result-object p0

    invoke-static {p0, p2, p3, p1}, Landroidx/compose/foundation/a;->a(LP/l;JLW/H;)LP/l;

    move-result-object p0

    const p2, 0x1e7ff

    const/4 p3, 0x1

    invoke-static {p0, v0, p1, p3, p2}, Landroidx/compose/ui/graphics/a;->a(LP/l;FLW/H;ZI)LP/l;

    move-result-object p0

    return-object p0
.end method

.method public static final b(JFLD/n;)J
    .locals 3

    sget-object v0, LA/q;->a:LD/M0;

    invoke-virtual {p3, v0}, LD/n;->k(LD/k0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LA/o;

    sget-object v1, LA/q;->b:LD/M0;

    invoke-virtual {p3, v1}, LD/n;->k(LD/k0;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    iget-wide v1, v0, LA/o;->p:J

    invoke-static {p0, p1, v1, v2}, LW/r;->c(JJ)Z

    move-result v1

    if-eqz v1, :cond_1

    if-eqz p3, :cond_1

    const/4 p0, 0x0

    int-to-float p0, p0

    invoke-static {p2, p0}, LG0/e;->a(FF)Z

    move-result p0

    iget-wide v1, v0, LA/o;->p:J

    if-eqz p0, :cond_0

    move-wide p0, v1

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    int-to-float p0, p0

    add-float/2addr p2, p0

    float-to-double p0, p2

    invoke-static {p0, p1}, Ljava/lang/Math;->log(D)D

    move-result-wide p0

    double-to-float p0, p0

    const/high16 p1, 0x40900000    # 4.5f

    mul-float/2addr p0, p1

    const/high16 p1, 0x40000000    # 2.0f

    add-float/2addr p0, p1

    const/high16 p1, 0x42c80000    # 100.0f

    div-float/2addr p0, p1

    iget-wide p1, v0, LA/o;->t:J

    invoke-static {p1, p2, p0}, LW/r;->b(JF)J

    move-result-wide p0

    invoke-static {p0, p1, v1, v2}, LW/D;->i(JJ)J

    move-result-wide p0

    :cond_1
    :goto_0
    return-wide p0
.end method
