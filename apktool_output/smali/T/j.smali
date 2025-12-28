.class public abstract Lt/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lt/l;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lt/l;

    sget-object v1, Lt/c;->a:Ls1/c;

    sget-object v1, LP/a;->o:LP/b;

    invoke-direct {v0, v1}, Lt/l;-><init>(LP/b;)V

    sput-object v0, Lt/j;->a:Lt/l;

    return-void
.end method

.method public static final a(LP/b;LD/n;I)Lt/l;
    .locals 5

    sget-object v0, Lt/c;->b:Ls1/c;

    invoke-virtual {v0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    sget-object v1, LP/a;->o:LP/b;

    invoke-virtual {p0, v1}, LP/b;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const p0, 0x149dc5c8

    invoke-virtual {p1, p0}, LD/n;->N(I)V

    invoke-virtual {p1, v2}, LD/n;->q(Z)V

    sget-object p0, Lt/j;->a:Lt/l;

    goto :goto_1

    :cond_0
    const v1, 0x149e981f

    invoke-virtual {p1, v1}, LD/n;->N(I)V

    invoke-virtual {p1, v0}, LD/n;->f(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    and-int/lit8 v3, p2, 0x70

    xor-int/lit8 v3, v3, 0x30

    const/16 v4, 0x20

    if-le v3, v4, :cond_1

    invoke-virtual {p1, p0}, LD/n;->f(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    :cond_1
    and-int/lit8 p2, p2, 0x30

    if-ne p2, v4, :cond_2

    goto :goto_0

    :cond_2
    move v1, v2

    :cond_3
    :goto_0
    or-int p2, v0, v1

    invoke-virtual {p1}, LD/n;->H()Ljava/lang/Object;

    move-result-object v0

    if-nez p2, :cond_4

    sget-object p2, LD/l;->a:LD/U;

    if-ne v0, p2, :cond_5

    :cond_4
    new-instance v0, Lt/l;

    invoke-direct {v0, p0}, Lt/l;-><init>(LP/b;)V

    invoke-virtual {p1, v0}, LD/n;->V(Ljava/lang/Object;)V

    :cond_5
    move-object p0, v0

    check-cast p0, Lt/l;

    invoke-virtual {p1, v2}, LD/n;->q(Z)V

    :goto_1
    return-object p0
.end method
