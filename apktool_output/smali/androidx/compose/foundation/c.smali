.class public abstract Landroidx/compose/foundation/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LD/M0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lq/E;->e:Lq/E;

    new-instance v1, LD/M0;

    invoke-direct {v1, v0}, LD/k0;-><init>(Lo2/a;)V

    sput-object v1, Landroidx/compose/foundation/c;->a:LD/M0;

    return-void
.end method

.method public static final a(Ls/g;Lq/C;)LP/l;
    .locals 2

    sget-object v0, LP/i;->a:LP/i;

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    instance-of v0, p1, Lq/H;

    if-eqz v0, :cond_1

    new-instance v0, Landroidx/compose/foundation/IndicationModifierElement;

    check-cast p1, Lq/H;

    invoke-direct {v0, p0, p1}, Landroidx/compose/foundation/IndicationModifierElement;-><init>(Ls/g;Lq/H;)V

    return-object v0

    :cond_1
    new-instance v0, LD0/b;

    const/4 v1, 0x2

    invoke-direct {v0, p1, v1, p0}, LD0/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    new-instance p0, LP/g;

    invoke-direct {p0, v0}, LP/g;-><init>(Lo2/f;)V

    return-object p0
.end method
