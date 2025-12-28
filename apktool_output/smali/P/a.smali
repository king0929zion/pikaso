.class public final LP/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg2/h;


# static fields
.field public static final d:LP/d;

.field public static final e:LP/d;

.field public static final f:LP/d;

.field public static final g:LP/d;

.field public static final h:LP/d;

.field public static final i:LP/d;

.field public static final j:LP/d;

.field public static final k:LP/d;

.field public static final l:LP/d;

.field public static final m:LP/c;

.field public static final n:LP/c;

.field public static final o:LP/b;

.field public static final p:LP/b;

.field public static final synthetic q:LP/a;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 4

    new-instance v0, LP/d;

    const/high16 v1, -0x40800000    # -1.0f

    invoke-direct {v0, v1, v1}, LP/d;-><init>(FF)V

    sput-object v0, LP/a;->d:LP/d;

    new-instance v0, LP/d;

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, LP/d;-><init>(FF)V

    sput-object v0, LP/a;->e:LP/d;

    new-instance v0, LP/d;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {v0, v3, v1}, LP/d;-><init>(FF)V

    sput-object v0, LP/a;->f:LP/d;

    new-instance v0, LP/d;

    invoke-direct {v0, v1, v2}, LP/d;-><init>(FF)V

    sput-object v0, LP/a;->g:LP/d;

    new-instance v0, LP/d;

    invoke-direct {v0, v2, v2}, LP/d;-><init>(FF)V

    sput-object v0, LP/a;->h:LP/d;

    new-instance v0, LP/d;

    invoke-direct {v0, v3, v2}, LP/d;-><init>(FF)V

    sput-object v0, LP/a;->i:LP/d;

    new-instance v0, LP/d;

    invoke-direct {v0, v1, v3}, LP/d;-><init>(FF)V

    sput-object v0, LP/a;->j:LP/d;

    new-instance v0, LP/d;

    invoke-direct {v0, v2, v3}, LP/d;-><init>(FF)V

    sput-object v0, LP/a;->k:LP/d;

    new-instance v0, LP/d;

    invoke-direct {v0, v3, v3}, LP/d;-><init>(FF)V

    sput-object v0, LP/a;->l:LP/d;

    new-instance v0, LP/c;

    invoke-direct {v0, v1}, LP/c;-><init>(F)V

    sput-object v0, LP/a;->m:LP/c;

    new-instance v0, LP/c;

    invoke-direct {v0, v2}, LP/c;-><init>(F)V

    sput-object v0, LP/a;->n:LP/c;

    new-instance v0, LP/b;

    invoke-direct {v0, v1}, LP/b;-><init>(F)V

    sput-object v0, LP/a;->o:LP/b;

    new-instance v0, LP/b;

    invoke-direct {v0, v2}, LP/b;-><init>(F)V

    sput-object v0, LP/a;->p:LP/b;

    new-instance v0, LP/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LP/a;->q:LP/a;

    return-void
.end method
