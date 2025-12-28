.class public final LA/v;
.super Ln0/i;
.source "SourceFile"

# interfaces
.implements Ln0/g;
.implements Ln0/a0;


# instance fields
.field public final s:Ls/g;

.field public final t:Z

.field public final u:F

.field public final v:LA/t;

.field public w:Lz/w;


# direct methods
.method public constructor <init>(Ls/g;ZFLA/t;)V
    .locals 0

    invoke-direct {p0}, Ln0/i;-><init>()V

    iput-object p1, p0, LA/v;->s:Ls/g;

    iput-boolean p2, p0, LA/v;->t:Z

    iput p3, p0, LA/v;->u:F

    iput-object p4, p0, LA/v;->v:LA/t;

    return-void
.end method


# virtual methods
.method public final Q()V
    .locals 2

    new-instance v0, LA/u;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, LA/u;-><init>(LA/v;I)V

    invoke-static {p0, v0}, Ln0/C;->o(LP/k;Lo2/a;)V

    return-void
.end method

.method public final Y()V
    .locals 2

    new-instance v0, LA/u;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, LA/u;-><init>(LA/v;I)V

    invoke-static {p0, v0}, Ln0/C;->o(LP/k;Lo2/a;)V

    return-void
.end method
