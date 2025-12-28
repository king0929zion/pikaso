.class final Landroidx/compose/foundation/layout/PaddingValuesElement;
.super Ln0/P;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ln0/P;"
    }
.end annotation


# instance fields
.field public final a:Lt/p;


# direct methods
.method public constructor <init>(Lt/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/layout/PaddingValuesElement;->a:Lt/p;

    return-void
.end method


# virtual methods
.method public final d()LP/k;
    .locals 2

    new-instance v0, Lt/q;

    invoke-direct {v0}, LP/k;-><init>()V

    iget-object v1, p0, Landroidx/compose/foundation/layout/PaddingValuesElement;->a:Lt/p;

    iput-object v1, v0, Lt/q;->q:Lt/p;

    return-object v0
.end method

.method public final e(LP/k;)V
    .locals 1

    check-cast p1, Lt/q;

    iget-object v0, p0, Landroidx/compose/foundation/layout/PaddingValuesElement;->a:Lt/p;

    iput-object v0, p1, Lt/q;->q:Lt/p;

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Landroidx/compose/foundation/layout/PaddingValuesElement;

    if-eqz v0, :cond_0

    check-cast p1, Landroidx/compose/foundation/layout/PaddingValuesElement;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    iget-object v0, p0, Landroidx/compose/foundation/layout/PaddingValuesElement;->a:Lt/p;

    iget-object p1, p1, Landroidx/compose/foundation/layout/PaddingValuesElement;->a:Lt/p;

    invoke-static {v0, p1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/layout/PaddingValuesElement;->a:Lt/p;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
