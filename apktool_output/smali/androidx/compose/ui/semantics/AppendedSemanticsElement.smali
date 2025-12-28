.class public final Landroidx/compose/ui/semantics/AppendedSemanticsElement;
.super Ln0/P;
.source "SourceFile"

# interfaces
.implements LP/j;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ln0/P;",
        "LP/j;"
    }
.end annotation


# instance fields
.field public final a:Z

.field public final b:Lo2/c;


# direct methods
.method public constructor <init>(Lo2/c;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->a:Z

    iput-object p1, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->b:Lo2/c;

    return-void
.end method


# virtual methods
.method public final d()LP/k;
    .locals 2

    new-instance v0, Lt0/b;

    invoke-direct {v0}, LP/k;-><init>()V

    iget-boolean v1, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->a:Z

    iput-boolean v1, v0, Lt0/b;->q:Z

    iget-object v1, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->b:Lo2/c;

    iput-object v1, v0, Lt0/b;->r:Lo2/c;

    return-object v0
.end method

.method public final e(LP/k;)V
    .locals 1

    check-cast p1, Lt0/b;

    iget-boolean v0, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->a:Z

    iput-boolean v0, p1, Lt0/b;->q:Z

    iget-object v0, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->b:Lo2/c;

    iput-object v0, p1, Lt0/b;->r:Lo2/c;

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/ui/semantics/AppendedSemanticsElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/ui/semantics/AppendedSemanticsElement;

    iget-boolean v1, p1, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->a:Z

    iget-boolean v3, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->a:Z

    if-eq v3, v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->b:Lo2/c;

    iget-object p1, p1, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->b:Lo2/c;

    invoke-static {v1, p1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-boolean v0, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->b:Lo2/c;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AppendedSemanticsElement(mergeDescendants="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->a:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", properties="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->b:Lo2/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
