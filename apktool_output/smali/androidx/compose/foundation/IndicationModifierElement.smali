.class final Landroidx/compose/foundation/IndicationModifierElement;
.super Ln0/P;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ln0/P;"
    }
.end annotation


# instance fields
.field public final a:Ls/g;

.field public final b:Lq/H;


# direct methods
.method public constructor <init>(Ls/g;Lq/H;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/IndicationModifierElement;->a:Ls/g;

    iput-object p2, p0, Landroidx/compose/foundation/IndicationModifierElement;->b:Lq/H;

    return-void
.end method


# virtual methods
.method public final d()LP/k;
    .locals 3

    new-instance v0, Lq/G;

    iget-object v1, p0, Landroidx/compose/foundation/IndicationModifierElement;->b:Lq/H;

    iget-object v2, p0, Landroidx/compose/foundation/IndicationModifierElement;->a:Ls/g;

    invoke-interface {v1, v2}, Lq/H;->a(Ls/g;)Ln0/h;

    move-result-object v1

    invoke-direct {v0}, Ln0/i;-><init>()V

    iput-object v1, v0, Lq/G;->s:Ln0/h;

    invoke-virtual {v0, v1}, Ln0/i;->f0(Ln0/h;)V

    return-object v0
.end method

.method public final e(LP/k;)V
    .locals 2

    check-cast p1, Lq/G;

    iget-object v0, p0, Landroidx/compose/foundation/IndicationModifierElement;->b:Lq/H;

    iget-object v1, p0, Landroidx/compose/foundation/IndicationModifierElement;->a:Ls/g;

    invoke-interface {v0, v1}, Lq/H;->a(Ls/g;)Ln0/h;

    move-result-object v0

    iget-object v1, p1, Lq/G;->s:Ln0/h;

    invoke-virtual {p1, v1}, Ln0/i;->g0(Ln0/h;)V

    iput-object v0, p1, Lq/G;->s:Ln0/h;

    invoke-virtual {p1, v0}, Ln0/i;->f0(Ln0/h;)V

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/foundation/IndicationModifierElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/foundation/IndicationModifierElement;

    iget-object v1, p1, Landroidx/compose/foundation/IndicationModifierElement;->a:Ls/g;

    iget-object v3, p0, Landroidx/compose/foundation/IndicationModifierElement;->a:Ls/g;

    invoke-static {v3, v1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Landroidx/compose/foundation/IndicationModifierElement;->b:Lq/H;

    iget-object p1, p1, Landroidx/compose/foundation/IndicationModifierElement;->b:Lq/H;

    invoke-static {v1, p1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Landroidx/compose/foundation/IndicationModifierElement;->a:Ls/g;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/foundation/IndicationModifierElement;->b:Lq/H;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
