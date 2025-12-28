.class public abstract LA/D;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LD/M0;

.field public static final b:LD/H;

.field public static final c:LA/E;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    sget-object v0, LA/p;->m:LA/p;

    new-instance v1, LD/M0;

    invoke-direct {v1, v0}, LD/k0;-><init>(Lo2/a;)V

    sput-object v1, LA/D;->a:LD/M0;

    sget-object v0, LA/p;->l:LA/p;

    sget-object v1, LD/U;->i:LD/U;

    new-instance v2, LD/H;

    invoke-direct {v2, v1, v0}, LD/H;-><init>(LD/H0;Lo2/a;)V

    sput-object v2, LA/D;->b:LD/H;

    new-instance v0, LA/E;

    sget-wide v1, LW/r;->f:J

    const/4 v3, 0x1

    const/high16 v4, 0x7fc00000    # Float.NaN

    invoke-direct {v0, v3, v4, v1, v2}, LA/E;-><init>(ZFJ)V

    sput-object v0, LA/D;->c:LA/E;

    new-instance v0, LA/E;

    const/4 v3, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, LA/E;-><init>(ZFJ)V

    return-void
.end method

.method public static final a(LD/n;)Lq/C;
    .locals 6

    sget-wide v0, LW/r;->f:J

    const v2, -0x4c54e819

    invoke-virtual {p0, v2}, LD/n;->N(I)V

    sget-object v2, LA/D;->a:LD/M0;

    invoke-virtual {p0, v2}, LD/n;->k(LD/k0;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    const/high16 v3, 0x7fc00000    # Float.NaN

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_2

    sget-object v2, Lz/u;->a:Lp/G;

    new-instance v2, LW/r;

    invoke-direct {v2, v0, v1}, LW/r;-><init>(J)V

    invoke-static {v2, p0}, LD/d;->C(Ljava/lang/Object;LD/n;)LD/Z;

    move-result-object v0

    invoke-virtual {p0, v4}, LD/n;->g(Z)Z

    move-result v1

    invoke-virtual {p0, v3}, LD/n;->c(F)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {p0}, LD/n;->H()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_0

    sget-object v1, LD/l;->a:LD/U;

    if-ne v2, v1, :cond_1

    :cond_0
    new-instance v2, Lz/f;

    invoke-direct {v2, v4, v3, v0}, Lz/f;-><init>(ZFLD/Z;)V

    invoke-virtual {p0, v2}, LD/n;->V(Ljava/lang/Object;)V

    :cond_1
    check-cast v2, Lz/f;

    goto :goto_0

    :cond_2
    invoke-static {v3, v3}, LG0/e;->a(FF)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {v0, v1, v0, v1}, LW/r;->c(JJ)Z

    move-result v2

    if-eqz v2, :cond_3

    sget-object v0, LA/D;->c:LA/E;

    move-object v2, v0

    goto :goto_0

    :cond_3
    new-instance v2, LA/E;

    invoke-direct {v2, v4, v3, v0, v1}, LA/E;-><init>(ZFJ)V

    :goto_0
    invoke-virtual {p0, v5}, LD/n;->q(Z)V

    return-object v2
.end method
